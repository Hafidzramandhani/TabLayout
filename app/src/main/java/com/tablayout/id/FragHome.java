package com.tablayout.id;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragHome extends Fragment {
	public FragHome() {

	}

	public static FragHome newInstance() {
		Bundle args = new Bundle();

		FragHome fragHome = new FragHome();

		fragHome.setArguments(args);
		return fragHome;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.frag_home, container, false);
	}
}