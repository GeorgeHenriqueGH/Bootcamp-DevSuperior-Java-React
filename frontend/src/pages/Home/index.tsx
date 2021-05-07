import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom"

const Home = () => {
    return (<>
        <NavBar></NavBar>
        <div className="container">
            <div className="jumbotron bg-secondary">
                <h1 className="display-4 text-primary">DSVendas</h1>
                <p className="lead text-white">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                <hr className="bg-light"/>
                <p className="text-white">Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                <Link to="/dashboard" className="btn btn-secondary btn-lg">Acessar dashboard</Link>
            </div>
        </div>
        <Footer></Footer>
    </>);
}

export default Home;