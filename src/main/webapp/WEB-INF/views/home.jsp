<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Niech Å¼yje Pan Gospodarz</title>

<style type="text/css">
* 									{ margin: 0; padding: 0; }
body								{ font: 14px Helvetica, Sans-Serif; background:  #FFFFFF;} 
#page-wrap							{ width: 800px; margin: 25px auto; } 
a									{ text-decoration: none; }
ul									{ list-style: none; }
p                                   { margin: 15px 0; }

/*  
	LEVEL ONE
*/
ul.dropdown                         { position: relative; }
ul.dropdown li                      { font-weight: bold; float: left; zoom: 1; background: #ccc; }
ul.dropdown a:hover		            { color: #000; }
ul.dropdown a:active                { color: #ffa500; }
ul.dropdown li a                    { display: block; padding: 4px 8px; border-right: 1px solid #333;
	 								  color: #222; }
ul.dropdown li:last-child a         { border-right: none; } /* Doesn't work in IE */
ul.dropdown li.hover,
ul.dropdown li:hover                { background: #F3D673; color: black; position: relative; }
ul.dropdown li.hover a              { color: black; }


/* 
	LEVEL TWO
*/
ul.dropdown ul 						{ width: 220px; visibility: hidden; position: absolute; top: 100%; left: 0; }
ul.dropdown ul li 					{ font-weight: normal; background: #f6f6f6; color: #000; 
									  border-bottom: 1px solid #ccc; float: none; }
									  
                                    /* IE 6 & 7 Needs Inline Block */
ul.dropdown ul li a					{ border-right: none; width: 100%; display: inline-block; } 

/* 
	LEVEL THREE
*/
ul.dropdown ul ul 					{ left: 100%; top: 0; }
ul.dropdown li:hover > ul 			{ visibility: visible; }
</style>

<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
<script type="text/javascript" language="javascript"
	src="js/jquery.dropdownPlain.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Niech żyje Pan Gospodarz</title>

<style type="text/css">
* 									{ margin: 0; padding: 0; }
body								{ font: 14px Helvetica, Sans-Serif; background:  #FFFFFF;} 
#page-wrap							{ width: 800px; margin: 25px auto; } 
a									{ text-decoration: none; }
ul									{ list-style: none; }
p                                   { margin: 15px 0; }

/*  
	LEVEL ONE
*/
ul.dropdown                         { position: relative; }
ul.dropdown li                      { font-weight: bold; float: left; zoom: 1; background: #ccc; }
ul.dropdown a:hover		            { color: #000; }
ul.dropdown a:active                { color: #ffa500; }
ul.dropdown li a                    { display: block; padding: 4px 8px; border-right: 1px solid #333;
	 								  color: #222; }
ul.dropdown li:last-child a         { border-right: none; } /* Doesn't work in IE */
ul.dropdown li.hover,
ul.dropdown li:hover                { background: #F3D673; color: black; position: relative; }
ul.dropdown li.hover a              { color: black; }


/* 
	LEVEL TWO
*/
ul.dropdown ul 						{ width: 220px; visibility: hidden; position: absolute; top: 100%; left: 0; }
ul.dropdown ul li 					{ font-weight: normal; background: #f6f6f6; color: #000; 
									  border-bottom: 1px solid #ccc; float: none; }
									  
                                    /* IE 6 & 7 Needs Inline Block */
ul.dropdown ul li a					{ border-right: none; width: 100%; display: inline-block; } 

/* 
	LEVEL THREE
*/
ul.dropdown ul ul 					{ left: 100%; top: 0; }
ul.dropdown li:hover > ul 			{ visibility: visible; }
</style>

<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
<script type="text/javascript" language="javascript"
	src="js/jquery.dropdownPlain.js"></script>
</head>

<body>

	<div id="page-wrap">

	<img src="images/images.jpg" alt="Wielkie drzewo" />

		<p>
			<a target="_blank" href="http://www.wp.pl">Wirtualna Polska</a> | <a target="_blank"
				href="http://www.onet.pl">Onet.pl</a> |
			<a target="_blank" href="http://www.interia.pl">Interia.pl</a>  | Chwila w ktÃ³rej nastÄpiÅo wyÅwietlenie strony: ${serverTime}.
		</p>

		<ul class="dropdown">
			<li><a href="#">Odbiorcy</a>
				<ul class="sub_menu">
					<li><a href="#">Dodaj odbiorce</a></li>
					<li><a href="#">UsuÅ odbiorce</a>
						<ul>
							<li><a href="#">ZÅy odbiorca</a></li>
							<li><a href="#">Dobry Odbiorca</a></li>
						</ul></li>
				</ul></li>
			<li><a href="#">Mail</a>
				<ul class="sub_menu">
					<li><a href="#">Dodaj Mail</a></li>
					<li><a href="#">UsuÅ Mail</a></li>
						<ul>
							<li><a href="#">ZÅy mail</a></li>
							<li><a href="#">Dobry mail</a></li>
						</ul></li>
					<!-- <li><a href="#">Layout &amp; Measurement Tools</a></li>
					<li><a href="#">Moisture Removal</a></li>
					<li><a href="#">Mound &amp; Home Plate Fortification</a></li>
					<li><a href="#">Mowers &amp; Stripers</a></li>
					<li><a href="#">Soil &amp; Enviornmental Management</a></li>
					<li><a href="#">Soil Amendments</a></li>
					<li><a href="#">Spreaders &amp; Sweepers</a></li>
					<li><a href="#"> - VIEW ALL - </a></li> -->
				</ul></li>
			<li><a href="#">TreÅÄ</a>
				<ul class="sub_menu">
					<li><a href="#">Z rÄki</a>
					<li><a href="#">Szablony</a>
						<ul>
							<li><a href="#">DuÅ¼e zakupy</a></li>
							<li><a href="#">MaÅe zakupy</a></li>
							<li><a href="#">Takie sobie zakupy</a></li>
						</ul></li>
					<li><a href="#">Pisma ponaglajÄce</a>
						<ul>
							<li><a href="#">Pierwsze ponaglenie</a></li>
							<li><a href="#">Drugie ponaglenie</a></li>
							<li><a href="#">Ostatnie ponaglenie</a></li>
						</ul></li>
				</ul></li>
			<li><a href="#">Dowcipy</a>
				<ul class="sub_menu">
					<li><a href="#">Dowcipy rysunkowe</a></li>
					<li><a href="#">Dowcipy tekstowe</a></li>
					<li><a href="#">Dowcipy filmowe</a></li>
				</ul></li>
			<li><a href="#">CoÅ od Was</a>
				<ul class="sub_menu">
					<li><a href="#">Od Åukaszy</a></li>
					<li><a href="#">Od AÅ</a></li>
					<li><a href="#">Od Gosi</a></li>
					<li><a href="#">Od Beaty</a></li>
					<li><a href="#">Od Kasi</a></li>
					<li><a href="#">Od PawÅa</a></li>
					<li><a href="#">Od Tomka</a></li>					
					<li><a href="odRobert.html">Od Roberta</a></li>					
				</ul></li>
		</ul>

	</div>

</body>

</html>

