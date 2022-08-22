package com.tablayout.id;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragFavorite extends Fragment {
	public FragFavorite() {

	}

	public static FragFavorite newInstance() {
		Bundle args = new Bundle();

		FragFavorite fragFavorite = new FragFavorite();

		fragFavorite.setArguments(args);
		return fragFavorite;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.frag_favorite, container, false);
	}
}