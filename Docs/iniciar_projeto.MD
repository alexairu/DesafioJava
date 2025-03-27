# Comandos Git para Projetos

Este documento descreve os comandos Git mais comuns para iniciar um repositório do zero e para clonar um projeto existente e trabalhar com ele.

## 1. Iniciar um Repositório e Committar no GitHub pela Primeira Vez

### Pré-requisitos
- Conta no GitHub
- Git instalado
- Repositório criado no GitHub

### Passos

```bash
# Navegar até a pasta do projeto
cd /caminho/para/seu/projeto

# Inicializar o repositório Git
git init

# Adicionar todos os arquivos ao controle de versão
git add .

# Fazer o primeiro commit
git commit -m "Primeiro commit"

# Adicionar o repositório remoto (substitua a URL pelo seu repositório)
git remote add origin https://github.com/usuario/nome-do-repositorio.git

# Enviar os arquivos para o GitHub (main ou master dependendo do repositório)
git branch -M main
git push -u origin main
