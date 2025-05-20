<%@include file='header.jsp'%>

<div class="container py-4">
    <h2 class="mb-4">Notícias em Destaque</h2>
    <div class="row">
        <c:forEach var="noticia" items="${noticiasDestaque}">
            <div class="col-md-4 mb-4">
                <div class="card h-100">
                    <img src="${noticia.imagem}" class="card-img-top" alt="Imagem">
                    <div class="card-body">
                        <h5 class="card-title">${noticia.titulo}</h5>
                        <p class="card-text">${noticia.resumo}</p>
                        <a href="ver-noticia?id=${noticia.id}" class="btn btn-primary">Leia Mais</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <h3 class="mt-5">Categorias Populares</h3>
    <div>
        <c:forEach var="categoria" items="${categoriasPopulares}">
            <a href="buscar-categoria?nome=${categoria}" class="badge bg-secondary me-1">${categoria}</a>
        </c:forEach>
    </div>
</div>

<%@include file='footer.jsp'%>
