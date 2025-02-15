package com.danisaavedra.cleanarchitecture.delegate

import com.danisaavedra.cleanarchitecture.service.api.ISearchBook
import org.springframework.stereotype.Service

@Service
class BooksDelegate(private val searchBook: ISearchBook) {

    fun searchBooks() {
        searchBook.getBooks()
    }
}
