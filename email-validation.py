fin = open('input.txt','r')
add_list = []
email = fin.readline()
while email:
	counter = 0
	for character in email:
		if character == '@':
			counter += 1
	if counter == 1:
		add_list.append(email)
	else:
		add_list.append('ERROR'+'\n')
	email = fin.readline()

fout = open('output.txt','w')
for add in add_list:
	fout.write(add)