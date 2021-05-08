import { Seller } from './seller';

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller;
}


export type SaleSum = {
    sallerName: string;
    sum: number;
}

export type SaleSuccess = {
    sallerName: string;
    visited: number;
    deals: number;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalElements: number;
    tolalPages: number;
    size?: number;
    first: boolean;
    number: number;
    numberOfElments?: number;
    emoty?: boolean;
}