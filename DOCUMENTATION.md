# Documentação do Sistema: Conversor de Temperatura 🔥❄️🌡️

## 1. Visão Geral

O Conversor de Temperatura é um sistema simples desenvolvido em Java que permite ao usuário converter valores de temperatura entre Celsius (C), Fahrenheit (F) e Kelvin (K).  
O sistema é executado via terminal, garantindo simplicidade e foco na funcionalidade.

---

## 2. Objetivo do Sistema

Permitir que o usuário realize conversões de temperatura de forma correta e intuitiva, garantindo:  
- Validação das entradas  
- Precisão na conversão (duas casas decimais)  
- Feedback claro em caso de erro

---

## 3. Regras de Negócio

1. O usuário deve fornecer apenas valores numéricos válidos.  
2. O usuário deve informar a unidade de origem e de destino corretamente (C, F ou K).  
3. O sistema deve retornar a temperatura convertida com duas casas decimais.  
4. Caso haja entrada inválida, o sistema deve avisar e solicitar nova entrada.

---

## 4. Requisitos Funcionais (RF)

- **RF01:** O sistema deve receber uma temperatura em Celsius, Fahrenheit ou Kelvin.  
- **RF02:** O sistema deve permitir conversão para qualquer uma das outras duas unidades.  
- **RF03:** O sistema deve exibir o resultado da conversão com duas casas decimais.  
- **RF04:** O sistema deve validar entradas inválidas e informar o usuário.  
- **RF05:** O sistema deve permitir múltiplas conversões em sequência, sem reiniciar o programa.

---

## 5. Requisitos Não Funcionais (RNF)

- **RNF01:** O sistema deve rodar no terminal, sem interface gráfica.  
- **RNF02:** O sistema deve ser compatível com Java 8 ou superior.  
- **RNF03:** As mensagens do sistema devem ser claras e amigáveis.  
- **RNF04:** O sistema deve ter desempenho rápido, mesmo para múltiplas conversões consecutivas.

---

## 6. Fluxo do Usuário / Casos de Uso

**Caso de Uso: Converter Temperatura**  

1. O usuário executa o programa.  
2. O sistema solicita a temperatura a ser convertida.  
3. O usuário informa o valor numérico.  
4. O sistema solicita a unidade de origem (C, F ou K).  
5. O usuário informa a unidade de origem.  
6. O sistema solicita a unidade de destino (C, F ou K).  
7. O usuário informa a unidade de destino.  
8. O sistema calcula a conversão e exibe o resultado.  
9. O usuário pode optar por realizar nova conversão ou encerrar o programa.

---

## 7. Exemplo de Execução

```text
Conversor de Temperatura
Digite a temperatura: 100
Digite a unidade da temperatura original (C, F ou K): C
Digite a unidade para converter (C, F ou K): F
100.00 C equivalem a 212.00 F
```
## 8. Tecnologias Utilizadas

* Java (JDK 8+)
* Terminal / Prompt de Comando

## 9. Possíveis Melhorias Futuras

* Adicionar suporte a outras unidades de temperatura (Rankine, Réaumur)
* Criar versão com interface gráfica (GUI)
* Internacionalização (multi-idiomas)
* Implementar testes automatizados para validar conversões

10. Autor

* Daniela Soares — Estudante de Análise de Requisitos e Desenvolvedora em aprendizado
