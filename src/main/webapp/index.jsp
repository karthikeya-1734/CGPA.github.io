<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GPA CALCULATOR</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
			background: linear-gradient(135deg, #ffecd2, #fcb69f);        }

        h1 {
        	color: #ff6f61;
    		margin-bottom: 20px;
    		font-weight	: 700;
        }

        .button-container {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
        }
        .container {
    background-color: #fff;
    padding: 25px;
    border-radius: 15px;
    box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
    text-align: center;
    max-width: 500px;
    width: 100%;
}

        .button-container button {
        	background-color: #ff6f61;
    		color: white;
    		padding: 14px 25px;
		    border: none;
		    border-radius: 8px;
		    cursor: pointer;
		    font-size: 18px;
		    font-weight: 700;
		    transition: background-color 0.3s, transform 0.3s, box-shadow 0.3s;
		    margin: 30px;
        }

        .button-container button:hover {
    background-color: #ff3d2e;
    transform: translateY(-3px);
    box-shadow: 0 4px 12px rgba(255, 111, 97, 0.5);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>GPA CALCULATOR</h1>
         <div class="button-container">
            <form action="semester-1" method="get">
                <button type="submit">SEMESTER 1</button>
            </form>
            <form action="semester-2" method="get">
                <button type="submit">SEMESTER 2</button>
            </form>
            <form action="semester-3" method="get">
                <button type="submit">SEMESTER 3</button>
            </form>
            <form action="semester-4" method="get">
                <button type="submit">SEMESTER 4</button>
            </form>
        </div>
    </div>
</body>
</html>
