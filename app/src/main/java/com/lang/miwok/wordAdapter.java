package com.lang.miwok;
import android.app.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class wordAdapter extends ArrayAdapter<word>{

	public wordAdapter(Activity Context,ArrayList<word>word){
		super(Context,0,word);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
				R.layout.listitem, parent, false);
        }
		
		word currentWord= getItem(position);
		
		// Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.defaultText);
		
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getDefaultTranslation());
		TextView iconView = (TextView) listItemView.findViewById(R.id.miwokText);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
       iconView.setText(currentWord.getmiwokTranslation());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
		
		
	}}


