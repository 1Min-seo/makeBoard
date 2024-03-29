<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
	<head>
		<title>게시판</title>
	</head>
	<hr />
	
	<nav>
		홈 - 글 작성
	</nav>
	<hr />
	
	<section id="container">
		<form role="form" method="post" action="/board/write">
			<table>
				<tbody>
					<tr>
						<td>
							<label for="title">제목</label>
							<input type="text" id="title" name="title" />
						</td>
					</tr>
					<tr>
						<td>
							<label for="content">내용</label>
							<textarea id="content" name="content"></textarea>
						</td>
					</tr>
					<tr>
						<td>
							<label for="writer">작성자</label>
							<input type="text" id="writer" name="writer" />
						</td>
					</tr>
					<tr>
						<td>
							<button type="submit">작성</button>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</section>
	<body>
	</body>
</html>