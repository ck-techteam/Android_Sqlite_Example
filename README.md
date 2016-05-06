<article class="markdown-body entry-content" itemprop="text">
<h1><a id="Android_CK-SqliteConnect" class="anchor" href="#Android_CK-SqliteConnect" aria-hidden="true"></a>Android_CK-SqliteConnect</h1>
<p>SQLite is a very light database that comes with Android OS. In this, we will discuss on how to write classes to handle insert and retrieve of data from Database</p>
<h3>Creating Database:
</h3>
<li><strong>Step 1:</strong>
</li>

<li>Create a Database class extending SqliteOpenHelper Class, so that it will override all the database necessary methods. 
</li>
<li>Create the Table in oncreate method with the table name.</li>
<li>
Create your own methods to insert and retrieve values. </li>
<li>
Values can be inserted only by using content values.</li>
<li>
You can retrieve the values using cursor.Cursor is a class which is used to read values from database.</li>
<li>
Now Create an xml file to input data and retrieve data.</li><br>
<img src="http://armorappz.com/github/Sqlite Database_activity.png">


<li><strong>Step 2:</strong>   Enter text in the editText and click on button. Get the value from input user and save to the database and in the listview show the datas.
<br><br>
</li>
<li><strong>Step 3:</strong> Create MainActivity.class to write the function for editText and button and list view. Write a ArrayAdapter to set the Values to the listView. Set the datanotifychanged to see the data change immediately.
<br><br>
<img src="http://armorappz.com/github/Sqlite Database_activity_java.png">
</li>
<li><strong>Step 4:</strong>
 Create a database file and retrieve the data from database and store it in the arraylist to show in the listview . Pass the values to Array Adapter and list the data.
<br><br>
<img src="http://armorappz.com/github/Sqlite Database_activity_db.png">
</li>

</article>
