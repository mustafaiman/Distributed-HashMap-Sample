package com.mustafa.distributed;

import com.mustafa.distributed.distributedhashmap.DistributedHashMap;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DistributedHashMap<String, String> dhm = new DistributedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type help for help");
        String line;
        while(true) {
            line = scanner.nextLine();
            String[] command = line.split(" ");

            switch (command[0]) {
                case "quit": return;
                case "getip":
                    System.out.println(dhm.getHost() + ":" + dhm.getPort());
                    break;
                case "connect":
                    dhm.connect(command[1],Integer.parseInt(command[2]));
                    break;
                case "put":
                    dhm.put(command[1],command[2]);
                    break;
                case "get":
                    System.out.println(dhm.get(command[1]));
                    break;
                case "remove":
                    dhm.remove(command[1]);
                    break;
                case "help":
                    System.out.println(
                            "getip\t\tip address and port of host\n" +
                            "connect <ip> <host>\t\tconnect to cluster node at <ip>:<port>\n" +
                            "put <key> <value>\t\tput <key> <value> to hashtable\n" +
                            "get <key>\t\tget <key> from hashtable\n" +
                            "remove <key>\t\tremove <key> from hashtable" +
                            "quit\t\tquit program");

            }

        }

    }
}
