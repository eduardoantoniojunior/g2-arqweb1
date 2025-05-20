<%@include file="header.jsp"%>

<div class="container py-5">
    <div class="row">
        <div class="col-lg-8 mx-auto">
            <h1 class="mb-3">${noticiaSelecionada.titulo}</h1>
            <p class="text-muted">Por ${noticiaSelecionada.nomeAutor} em ${noticiaSelecionada.dataPublicacao}</p>
            <hr>
            <p>${noticiaSelecionada.texto}</p>
        </div>
    </div>
</div>

<%@include file="footer.jsp"%>
