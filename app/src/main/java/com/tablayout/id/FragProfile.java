package com.tablayout.id;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragProfile extends Fragment {
	public FragProfile() {

	}

	public static FragProfile newInstance() {
		Bundle args = new Bundle();

		FragProfile fragProfile = new FragProfile();

		fragProfile.setArguments(args);
		return fragProfile;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.frag_profile, container, false);
	}
}