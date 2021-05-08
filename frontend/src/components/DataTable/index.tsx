import axios from "axios";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { SalePage } from "types/sale";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

const DataTable = () => {
    const [pages, setPage] = useState<SalePage>({
        last: true,
        first: true,
        number: 0,
        totalElements: 0,
        tolalPages: 0
    })

    const [activePages, setActivePages] = useState(0);

    const changePage = (index: number) => {
        setActivePages(index);
    }

    useEffect(() => {
        axios.get(`${BASE_URL}/sales?page=${activePages}&size=20&sort=date,desc`)
            .then(response => {
                setPage(response.data);
            });
    }, [activePages]);

    return (<>
        <Pagination page={pages} onPageChange={changePage}></Pagination>
        <div className="table-responsive">
            <table className="table table-dark table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th> 
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    {pages.content?.map(item => (
                        <tr key={item.id}>
                            <th>{formatLocalDate(item.date, "dd/MM/yyyy")}</th>
                            <th>{item.seller.name}</th>
                            <th>{item.visited}</th>
                            <th>{item.deals}</th>
                            <th>{item.amount.toFixed(2)}</th>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    </>);
}

export default DataTable;