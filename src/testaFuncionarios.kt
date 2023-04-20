fun testaCFuncionarios(){
val igor = Funcionario(
    "Igor",
    "564954679",
    1000.00
)
println("nome ${igor.nome}")
println("cpf ${igor.cpf}")
println("salário ${igor.salario}")
println("Bonificação ${igor.bonificacao}")

val gabi = Gerente(
    nome = "Gabi",
    cpf = "222.222.222-22",
    salario = 2000.0,
    senha = 1234
)
println("nome ${gabi.nome}")
println("cpf ${gabi.cpf}")
println("salário ${gabi.salario}")
println("Bonificação gerente ${gabi.bonificacao}")

if(gabi.autentica(1234)){
    println("Autenticou com sucesso!")
}else{
    println("Falha na autenticação")
}
val silas = Diretor(
    nome = "Silas",
    cpf = "333.333.333-33",
    salario = 15000.0,
    senha = 6326,
    plr = 2000.0
)
println("nome ${silas.nome}")
println("cpf ${silas.cpf}")
println("salário ${silas.salario}")
println("Bonificação diretor ${silas.bonificacao}")
if(silas.autentica(6326)){
    println("Autenticou com sucesso!")
}else{
    println("Falha na autenticação")
}

val caluladora = CalculadoraBonificacao()
caluladora.registra(igor)
caluladora.registra(gabi)
caluladora.registra(silas)
println("Total de bonificação: ${caluladora.total}")
}