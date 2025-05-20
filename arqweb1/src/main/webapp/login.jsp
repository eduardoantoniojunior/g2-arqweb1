<%@include file="header.jsp"%>

<div class="container py-5">
    <h2 class="text-center mb-4">Login</h2>
    <form action="login" method="post" class="mx-auto" style="max-width: 400px;">
        <div class="mb-3">
            <label for="email" class="form-label">E-mail</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>

        <div class="mb-3">
            <label for="senha" class="form-label">Senha</label>
            <input type="password" class="form-control" id="senha" name="senha" required>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Entrar</button>
        </div>
    </form>
</div>

<%@include file="footer.jsp"%>
