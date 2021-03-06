package com.xiaoheifamily.googlebookreader.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaoheifamily.googlebookreader.R;
import com.xiaoheifamily.googlebookreader.databinding.BookDetailFragmentBinding;
import com.xiaoheifamily.googlebookreader.model.Book;
import com.xiaoheifamily.googlebookreader.viewmodel.BookDetailViewModel;

public class BookDetailFragment extends Fragment {

    public static final String ARG_BOOK = "book";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.book_detail_fragment, container, false);
        BookDetailFragmentBinding bind = BookDetailFragmentBinding.bind(view);

        Book book = (Book) getArguments().get(ARG_BOOK);
        bind.setModel(new BookDetailViewModel(book));

        return view;
    }
}