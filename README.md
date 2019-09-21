# To-check-whether-the-given-IP-addresses-belongs-to-the-same-subnet-or-different-subnet
Used packages such as regex.matcher & regex.pattern
Following with class subnet
Following with main

Checking for exception 
If lenght is null or more 
Prints messageFor command line arguments we used args[0],args[1] 
Taking ip1,ip2 address as string values from user

Netmask is taken directly as a integer value

Now we are Validating the ip address 
If the ip address is invalid  console will quit the program orelse it will continue.

String mask we have taken as a empty string

In the for loop 
We have put I range of 0-32 
If the users enters 18 as net mask then 
First 18 bits will append 1 then the rest  14 bits gets append to 0.

If(i<netmask)
   Mask+=1
else
Mask+=0

Then we are performing AND operation for
1.Between ip1 & mask 
   The result of this is taken as result1
2.Between ip2 & mask
The result of this is taken as result2
By using andMask method

Then 
If result1 is equal to result2 
Print message same subnet
Else
Different subnet
Next in the andmask function taking ip address & mask as the parameters which is splitted using dot operator
Then a,b,c,d are taken as integer number and converted to binary using toBinaryString 
We require 8bits with 7 spaces so replacing those 7 with 0
Using string.format for all A B C D

Using octect
Converted to octet bits of binary string and added string at the end 
This is string addition
Now we have ip & mask in binary format
Then performing AND operation
1&1=1=result+=1
1&0=0=result+=0

Returning result

Validate of String ip address
It is a pattern which we borrowed from google 
link--https://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
Maximum limit of a 8bit is 255 
So providing this in a range we get pattern 
Validate is used to check for valid ip address
Matcher is a object for matcher of ipaddress

If matcher & matches are same
Return true 
Else
False

sources<-- keen help from grop19
https://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
Example:
ip1:10.20.30.40  ip2:10.20.33.40  21
output:Different subnet

ip1:10.20.30.40  ip2:10.20.33.40  18
output:Same subnet

If no inputs are given:
output:One  or more invalid IP Addresses specified.\nTry again

