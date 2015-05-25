#Sample Application for Distributed Hashmap
This repository was created for demonstration purposes of [Distributed Hashmap](https://github.com/mustafaiman/Distributed-Hash-Map)
It basically provides an application which can join a cluster of hashtable. You can add, remove and get entries from a
hashtable on network.

This repository contains Distributed Hashmap library as a jar file in lib folder for ease of use. New versions can be downloaded
from its own GitHub repository.
##Usage
An instance of this application needs to know ip address and public port number of one of the computers in cluster in order to join the cluster.

After starting an instance you can learn its ip address and public port by typing *getip*. Then you can use this information to join other instances
to the cluster.

*connect -ip- -port-* connects the instance to specified cluster. After this point, the changes you make to the hashtable on
one instance is reflected on the others.

*help* command retrieves a comprehensive list of available commands.

###Sample Scenario
**Node 1**

getip

*123.456.789.123:4040*

**Node 2**

connect 123.456.789.123 4040

put key value

**Node 1**

get key

*value*

remove key

**Node 2**

get key

*null*
##Issues
An instance which joins a cluster after some time cannot retrieve the entries which were created before it joined the cluster.
This is caused by inability of underlying Distributed Hashmap library.