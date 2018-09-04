package com.aliatec.douglas.finder.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aliatec.douglas.finder.fragment.ConversaFragment;
import com.aliatec.douglas.finder.fragment.PerfilFragment;

public class TabAdapter extends FragmentStatePagerAdapter {

    private String[] tituloAbas = {"PERFIL", "CONVERSAS"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment  = null;

        switch (position) {
            case 0:
                fragment = new PerfilFragment();
                break;
            case 1:
                fragment = new ConversaFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return tituloAbas.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tituloAbas[position];
    }

}
