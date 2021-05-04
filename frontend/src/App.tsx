import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const App = () => {
  return (<>
    <NavBar></NavBar>
    <div className="container">
      <DataTable></DataTable>
    </div>
    <Footer></Footer>
  </>);
}

export default App;
