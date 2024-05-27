# ELP Project
### _2023/24_
## Author:
Paulo Filipe - 100502

## Quick arguments list:
```
deep-resumo.jql deep-lei.json out-resumo.json out-final-doc.json
```
## Notes:
- ### Added a little extra: Allows nested * (find) operators
  - Instructions like: `modulosNomes = doc.ucs*.modulos*.nome`, 
    `horasSemanais = doc.ucs*.modulos*.horas | sum` that include nested for each object operator are supported;
