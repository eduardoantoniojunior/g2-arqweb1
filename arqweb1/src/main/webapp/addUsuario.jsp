<%@include file="header.jsp" %>

<div class="container py-5">
    <h2 class="text-center mb-4">Cadastro de Novo Usuário</h2>

    <form action="criar-usuario" method="post" class="mx-auto" style="max-width: 500px;">
        <div class="mb-3">
            <label for="nome" class="form-label">Nome completo</label>
            <input type="text" class="form-control" id="nome" name="nome" required>
        </div>

        <div class="mb-3">
            <label for="email" class="form-label">E-mail</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>

        <div class="mb-3">
            <label for="senha" class="form-label">Senha</label>
            <input type="password" class="form-control" id="senha" name="senha" required>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-success">Cadastrar</button>
        </div>
    </form>
</div>

<%@include file="footer.jsp" %>
