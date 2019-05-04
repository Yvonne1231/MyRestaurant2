package com.example.teacher.myapplication;

import android.app.Activity;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

class MyListView {
    public static class MyListAdapter implements ListAdapter {
        Activity context;
        private String[] maintitle;
        private  String[] price;
        private Integer[] imgid;

        public MyListAdapter(ContActivity contActivity, String[] maintitle, String[] price, Integer[] imgid) {
        }

        @Override
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override
        public boolean isEnabled(int position) {
            return false;
        }

        @Override
        public void registerDataSetObserver(DataSetObserver observer) {

        }

        @Override
        public void unregisterDataSetObserver(DataSetObserver observer) {

        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            this.context = context;
            this.maintitle = maintitle;
            this.imgid = imgid;
            this.price = price;
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.customlayout, null,true);

            TextView titleText = (TextView) rowView.findViewById(R.id.tv1);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
            TextView subtitleText = (TextView) rowView.findViewById(R.id.tv2);

            titleText.setText(maintitle[position]);
            imageView.setImageResource(imgid[position]);
            subtitleText.setText(price[position]);

            return rowView;


          
        }

        @Override
        public int getItemViewType(int position) {
            return 0;
        }

        @Override
        public int getViewTypeCount() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }
}
