import header from "../../assets/img/header.svg"
import "./style.css"

function Header() {
  return (
    <>
      <header>
        <div className="dsmeta-logo-container">
          <img src={header} alt="DSMeta" />
          <h1>Controle de Vendas</h1>
          <p>
            Desenvolvido por 
             <a href=" https://www.instagram.com/pablunogueira/">
               @pablunogueira
            </a>
          </p>
        </div>
      </header>
    </>
  );
}

export default Header;
