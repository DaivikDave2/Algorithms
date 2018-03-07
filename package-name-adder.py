import os;
import re;
directory="C:\\Users\hp\\Desktop\\algorithms\\libraries\\"
directory_names=os.listdir(directory)
for name in directory_names:
     matchObj=re.match("(.*)(.java)",name)
     if(matchObj):
        packname=matchObj.group(1)
        f=open((directory+name), 'r+')
        content=f.read()
        f.seek(0, 0)
        line="package libraries."+packname+";"
        f.write(line.rstrip('\r\n') + '\n' + content)
