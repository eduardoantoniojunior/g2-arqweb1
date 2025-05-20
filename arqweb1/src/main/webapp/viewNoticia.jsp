<%@include file="header.jsp"%>

<div class="container py-5">
    <div class="row">
        <div class="col-lg-8 mx-auto">
            <h1 class="mb-3">${noticia.titulo}</h1>
            <p class="text-muted">Por ${noticia.autor} em ${noticia.dataPublicacao}</p>
            <img src="${noticia.imagem}" class="img-fluid mb-4" alt="Imagem">
            <p><strong>Categoria:</strong> ${noticia.categoria}</p>
            <p><strong>Visualizações:</strong> ${noticia.visualizacoes}</p>
            <hr>
            <p>${noticia.conteudo}</p>
        </div>
    </div>
</div>

<%@include file="footer.jsp"%>
