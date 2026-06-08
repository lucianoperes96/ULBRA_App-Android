# Calculadora de IMC

Aplicativo Android desenvolvido em Kotlin para cálculo do Índice de Massa Corporal (IMC).

## Objetivo

Este projeto foi desenvolvido como atividade prática da disciplina de Tecnologias Móveis do curso de Análise e Desenvolvimento de Sistemas da ULBRA.

O aplicativo permite que o usuário informe:

- Nome
- Idade
- Peso
- Altura

Com base nos dados informados, o sistema calcula automaticamente o IMC, exibe a classificação correspondente e apresenta uma mensagem personalizada de orientação.

---

## Funcionalidades

✅ Cadastro de nome do usuário

✅ Cadastro de idade

✅ Cadastro de peso

✅ Cadastro de altura

✅ Cálculo automático do IMC

✅ Exibição do resultado com duas casas decimais

✅ Classificação do IMC

✅ Mensagens personalizadas para cada faixa de IMC

✅ Interface personalizada com cores e layout adaptados

---

## Fórmula utilizada

O cálculo do IMC é realizado através da fórmula:

IMC = Peso / (Altura × Altura)

Exemplo:

Peso = 70 kg

Altura = 1,75 m

IMC = 70 / (1,75 × 1,75)

IMC = 22,86

---

## Classificação do IMC

| IMC | Classificação |
|------|--------------|
| Menor que 16,0 | Magreza Extrema |
| 16,0 a 18,49 | Magreza |
| 18,5 a 24,99 | Peso Normal |
| 25,0 a 29,99 | Sobrepeso |
| 30,0 a 34,99 | Obesidade Grau I |
| 35,0 a 39,99 | Obesidade Grau II |
| 40,0 ou mais | Obesidade Grau III |

---

## Mensagens exibidas

O aplicativo apresenta mensagens personalizadas de acordo com a classificação obtida:

- Magreza Extrema: "🚨 Alerta! Seu IMC indica magreza extrema. Procure orientação médica especializada."
- Magreza: "⚠️ Atenção! Você está abaixo do peso ideal."
- Peso Normal: "🎉 Parabéns! Você está dentro da faixa considerada saudável."
- Sobrepeso: "⚠️ Atenção! Seu IMC indica sobrepeso. Considere hábitos mais saudáveis."
- Obesidade Grau I: "🚨 Alerta! Seu IMC indica obesidade grau I."
- Obesidade Grau II: "🚨 Alerta! Seu IMC indica obesidade grau II. É recomendável buscar acompanhamento profissional."
- Obesidade Grau III: "🚨 Alerta! Seu IMC indica obesidade grau III. Procure orientação médica especializada."

---

## Tecnologias utilizadas

- Kotlin
- Android Studio
- Android SDK
- XML para construção das interfaces

---

## Autor

Projeto desenvolvido por **Luciano Cardoso Peres** para fins acadêmicos na disciplina de Tecnologias Móveis do curso de Análise e Desenvolvimento de Sistemas.
