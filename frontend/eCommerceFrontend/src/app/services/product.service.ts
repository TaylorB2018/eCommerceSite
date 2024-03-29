import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { Product } from '../common/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl = 'http://localhost:8080/api/products';


  constructor(private HttpClient: HttpClient) { }

  getProductList(): Observable<Product[]>{
    return this.HttpClient.get<GetReponse>(this.baseUrl).pipe(
      map(response => response._embedded.products)
    );
  }
}
interface GetReponse{
  _embedded:{
    products: Product[];
  }
}
