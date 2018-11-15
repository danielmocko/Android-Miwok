package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> word,int mColorResourceId){
        super(context,0,word);
        this.mColorResourceId=mColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.miwokImage);
        if(currentWord.hasImage()) {
            miwokImageView.setImageResource(currentWord.getImageResourceID());
            miwokImageView.setVisibility(View.VISIBLE);
        }else{
            miwokImageView.setVisibility(View.GONE);
        }
        //TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_textView);
        miwokTextView.setText(currentWord.getMiwok());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_textView);
        defaultTextView.setText(currentWord.getDefaultTranslate());

        View textContainer = listItemView.findViewById(R.id.textContainer);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
