Technical Stack: 
	Java - 1.8.***
	Maven - 3.6.*
	Docker - 19.03
	IDE - InteliJ
	Documentation - Swagger 
	API testing tool - Swagger and Postman 
	
Kindly follow below steps to run application 
1. Build application with following command 
	mvn clean install 
	Once build is successful, it will generate one tar file under target folder 

2. Once build is sucess, execute below command to run the same application in docker 
	Make sure docker is install in the machine where its executed 
	create image -> docker build -t wapp . 
	verify image once created -> docker images 
		eurodigital must be availble 
	Run image -> docker run -t -p9090:8080 wapp
	above step will run application in docker contianer 
	
3. Steps2 will create image and run the same on 9090 port. Hit below URL to open swagger documents 
	http://localhost:9090/swagger-ui.html

App HLD in draw.io 
https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=HLD.drawio#R5Vpbb6M4FP41edyISyDw2CbtrFatplKr7cy8jBxwwbsGI%2BM0SX%2F92mBuNgnZKbQznVZK8PGV7zvfObaVmb1K9p8oyOJbEkI8s4xwP7PXM8taehb%2FFIZDabB9pzREFIWlyWwM9%2BgFSqMhrVsUwrzTkBGCGcq6xoCkKQxYxwYoJbtusyeCu7NmIIKa4T4AWLc%2BopDFpdVzjMb%2BJ0RRXM1sGrImAVVjachjEJJdy2RfzewVJYSVT8l%2BBbHArsKl7Hd9pLZeGIUpO6fD4uHbZ4s9%2FvX3%2Fhqwl%2Bwb%2B7y9%2FcOU9DwDvJVvLFfLDhUElGzTEIpRzJl9uYsRg%2FcZCETtjnPObTFLsKx%2BQhivCCa06GtfF3%2FcHoI8rseQc0LK4P7o25g1Rty3IEkgowfepOrgSVilX5lLufBdw5JdcRG3GfI86R3SM6J67AY8%2FiDx%2Bx9Y%2BhpyMOS%2BJIuEsphEJAX4qrFeNtgavNS0uSEkk2D9Axk7SGGALSNdvHNGyb%2BwhbhniP%2B6pnLaBnaxqNOg83cgWxrAE%2B%2B66CeHQgwYeu6O3we07HpHEJ%2B5IdVWSPWc7hAM0Agy2Uuhq17GjzO4GBYD2TKMUg54FW6MtnOLgnBrxAPIDdhAfEdyxBBJed2GMEaSVoMLjCJRwQTVl0CWAs4FpArJMcjE%2FMk%2BEkF2Dna5PU%2FIBmH4PcCoYE9V3mp15RTK411C0aSqS0kKx9Ggo7DlGj0S1BVYdRtdgFXO%2BC0U6LyJAi3XmS%2FfVoTOsAhBnpXie0J7Qd1lBini8wrdrPkUfHMA7xpTmy1NZnVa1oSc8ySH0uih8AObG1BSbBaq7zVKIv6GGG34JwgE6t9DRPnKiID4GokZUsi4RMk2nOfP0TiyWygUObrsnB7Z2ebcOe4OrxOeqVH0cYXnvonwbNtS6ZpYd%2B6w7gZTW4udM7Ncl0SZm5RU5vurVZHKtDz4sqVwHpAk25ajZaQQ3dUzHz4fb7OpKM42z1PcYiq9ecNUwTS8EMefBtQWN13pddVin1TWuTrSoRzAqrK9VkaW36XKUTgo5a2JaHAg031bNZrL9wipnER6%2BCL7F4WvosAjkSyu9%2B3K9aHjQueF4pwjxyrfDDDIcxRU5muE66XsEfvSem4thJeadYhCtYwRo3xFf0nzKaKmyQcLV8nyvqHmgyOuPJoH2lqUeYSAxTzQWsYtH3KleegoNwUjxGvLX3bF6%2FlawPb67gacEzy9bod0xtGyFbIVWejmgWA%2B7qbo3YK5dhhxfyyYW8bAQFMH8zPONL9pwnYsZW%2FluGfGucGhTFcbamqe9T30Q4xoyE13XMYC1XtInxGPiD9r6HQN9QpOD51uX%2BhcTHaro%2B92L0KQsSIP8QMG1rDkb89OHRV7ThnSpB1P1FNMgsKw2Gr1MdRV6QhkLHwlbtn6waMGvnPWn4wMXyOj9mjjBhwEKR%2BVDfW%2B0%2B6573xbNqqA12JjVV4HWy5IBAjpJs%2Fqt%2F%2BIpJgKJ8t350TP9Z8AgztwmCbmH4U%2FJhS9kJQBPKIEzsgOfVf%2B022sLT3l1gFJ1YCLhc9veIhyI%2FG0RnlAOB4fghklOFk9QuhjZjmZDpZ6bCLpE4p0HgRhPYnj1yfhXHksJ1OHvndqzvA%2F%2B1bU9ofR7DvFu5OhqW9%2BGjSbPemvhqvlelPhyovND1zKU1bzKyH76j8%3D

