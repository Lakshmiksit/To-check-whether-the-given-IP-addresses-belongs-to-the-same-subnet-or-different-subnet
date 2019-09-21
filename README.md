# To-check-whether-the-given-IP-addresses-belongs-to-the-same-subnet-or-different-subnet

First starting with main,here exceptional handling is done using try and catch.
we have used sameNetwork here which goes to sameNetwork method.
Before that we have used private static String ip1,ip2,mask;
Where private is an access specifier to make the member visible only inside the class and no other class can access it. static because one variable can be shared by all instances of the class.
ip1,ip2,mask are the variables taken to accept the values.
Now coming to sameNetwork method, inside this method we have byte[] a1 = InetAddress.getByName(ip1).getAddress();
byte[] a1 is that we have a1 as a byte(A data type of 8-bit signed two's complement integer).
InetAddress determines the IP address of a host from given host's name. So here this contains internet address as two fields : hostname(a string) and address(an int).
Hostname contains the name of the host. ex: for an IP address, getByName gives www.abcd.com and getAddress gives the 32 bit IP address.
Similarly we have done it for ip2 and mask.
Here we have also done it for mask because the netmask taken is in form of ex: 255.255.255.0
Next comes for loop
i=0; i<a1.length; i++
initially i=0 and here i (i.e.,0 for now) is < a1.length, it is satisified and goes to if condition.
if ((a1[i] & m[i]) != (a2[i] & m[i]))
It performs bit wise AND operation and a1.length checks bit by bit.
1--->ip1,mask gets performed AND operation

And

2--)ip2,mask gets performed AND operation

If 1 is not equal to 2 
Then false
else true.

In main method we have boolean check=sameNetwork(args[0],args[1],args[2]);
It will always go to if condition because it is always true if we use keyword "true" for if condition, so instead of that we are storing its return value as boolean check = sameNetwork();
And now we can use this check in if condition
if(check)
print "SAME SUBNET"
else
print "DIFFERENT SUBNET"
As we are handling the exceptions we have catch here which prints "invalid input" when no input is given and will not allow the program to crash.
Example:
ip1:10.20.30.40  ip2:10.20.33.40  21
output:Different subnet

ip1:10.20.30.40  ip2:10.20.33.40  18
output:Same subnet

If no inputs are given:
output:One or more invalid IP Addresses specified.\n
output:
