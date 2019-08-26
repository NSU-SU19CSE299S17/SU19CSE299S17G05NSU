# SU19CSE299S01G05NSU
Encrypted group chatting app

Sadman Ahmed 
1632066042
sadman.ahmed01@northsouth.edu

# Project Proposal
<p align="center">
	<img src="http://old.unb.com.bd/media/imgAll/August2017/BG/NSU-Logo-201709100837.JPG">
</p>

<p align="center">	
 Encrypted Group-Chat App
</p>

<p align="center">
 CSE299
 <br/>
 Section: 17
 <br/>
 Semester: Summer 2019
 <br/>
 Faculty Name: Shaikh Shawon Arefin Shimon
</p>

<p align="center">
 By
 <br/>
 Sadman Ahmed
 <br/>
 1632066042 
 <br/>
 Group:05
 <br/>
 <br/>
 sadman.ahmed01@northsouth.edu
 <br/>
 Git repos link: https://github.com/SadmanAhmed97/SU19CSE299S17G05NSU <br/>
	Slack link: https://app.slack.com/client/TKDJD0XGV/CKKK82VK6 <br/>
	Tutorial followed as reference: https://www.youtube.com/playlist?list=PLxefhmF0pcPmtdoud8f64EpgapkclCllj
 <br/>
 Date prepared: 16/06/2019
</p>

<h4>Table Of Contents</h4>
<p><br/>
1) Project Summary <br/>
2) Project Description<br/>
	a. Features <br/>
	b. Technology<br/>
	c. Roadblocks <br/>
</p>

<h4>1.	Project Summary </h4>
This is a simple WhatsApp clone, in which the user can login or create an account in firebase. Then the user can use the app with whoever has the app installed and share info with them. 

<h4>2.	Features	</h4>

<ul>Login Activity</ul>
	<p>
	Users can create an account with email and password or phone number as well. They can then login with any of the following.
	</p>
<ul>Firebase implementation</ul>	
	<p>
	The app is implemented with firebase methods. It includes Firebase Authentication, Firebase Database and Firebase Storage 
	</p>	
<ul>Display </ul>
	<p>
	There are 4 fragments in the app, and also a drop down menu. The fragments are Chats, Contacts, Groups and Request.<br/>
	The chats fragments show any active users that the user is chatting with. <br/>
	The contacts fragments shows the users the contacts in the user's saved list<br/>
	The groups fragment shows the groups in which the user is added.<br/>
	The request fragement shows the sent requests to and by thee user.<br/><br/>
	In the drop down menu, there are options to find friends which will basically redirect users to all those using the app. The create group option will allow the user to name and create a group. The settings option will allow the user to set a username, status and also picture. The logout button, takes the user out of the app.
	</p>
<ul>Group chat</ul>
	<p>
	The idea of group chat is implemented. Currently, users in the database are added in the group chat. For each person talking in the group, there is a tag for the name, date and time that the person has talked in the group.
	</p>
<ul>One to one chat</ul>
	<p>
	For one to one chat, users can send request to users and also accept requests. Upon accepting the request, the user can then start chatting with other user in the chat fragment.
	Different colors added will be added for the sender and receiver texts.
	</p>

<h4>3> Roadblocks</h4>
A lot of methods could not be implemented due to shortage of time and also because the tutorial being followed was backdated.
These methods include: 
	<ul>Adding a profile image to the app</ul>
	<ul>Creating groups and adding custom users</ul>
	<ul>Sending media to another user</ul>
	<ul>Method of monetizing</ul>
	<ul>Displaying timestamp of the users</ul>
	<ul>Push Notification</ul>
	<ul>Fully working phone number authentication</ul>
	<ul>A strongger/different endryption/decyption method for sending messages</ul>
	<ul>Using a separate socket programming for the server-chat relation</ul>

<h4>4.	Technology </h4> 
Android Studio would be used to make this app. For the decryption and encryption purpose, Firebase security is used.

<h4>5.	Monetization/Business plan </h4> The app would be free to use. However, there can many methods of monetization. In the home page, there would be ads displayed, clicking on which the user would be directed to the advertised product. They can then buy the products on which the app company may charge a commission on sales. If users do not want advertisements, they can upgrade to a premium ad-free service. Also, there can be in-app purchases made, where users can buy stickers or any other service out of the ordinary.

Since the app is made in Bangladesh, the method of accessing the paid services is through mobile financial services such as bKash or UCash. Here, the users can easily complete the payment in a way which is familiar to them to attain the privileges.
