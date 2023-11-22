package com.example.trabalho_mobile;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> ParentListItems;
    private  List<String> Items;
    private Object ListView;

    ListAdapter(Activity context,List<String> Items, Map<String, List<String>> ParentListItems){
        this.context = context;
        this.ParentListItems = ParentListItems;
        this.Items = Items;
    }
    @Override
    public int getGroupCount() {
        
        return Items.size();
    }

    @Override
    public Object getGroup(int groupPosition) {

        return Items.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {

        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String string = (String) getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert layoutInflater != null;
            convertView = layoutInflater.inflate(R.layout.parent_item, null);
        }
        TextView item = convertView.findViewById(R.id.textParent);
        item.setText(string);
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        return Objects.requireNonNull(ParentListItems.get(Items.get(groupPosition))).size();
    }

    @Override
    public Object getChild(int groupPositions, int childPosition) {
        return Objects.requireNonNull(ParentListItems.get(Items.get(groupPositions))).get(childPosition);
    }

    @Override
    public long getChildId(int groupPositions, int childPosition) {

        return childPosition;
    }

    @Override
    public View getChildView(int groupPositions, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childName = (String) getChild(groupPositions,childPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if (convertView == null){
            convertView = inflater.inflate(R.layout.child_item, null);

        }

        TextView item = convertView.findViewById(R.id.texChild);
        item.setText(childName);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPositions, int childPosition)
    {
        return true;

    }


    @Override
    public boolean hasStableIds() {

        return true;
    }

}
