// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.app.item.view.VariantView;
import com.walmart.android.service.item.VariantsModel;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.CornerRadiusDrawable;
import com.walmart.android.wmui.DrawableTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VariantController
{
    private static class SwatchVariantAdapter extends BaseAdapter
    {

        private final Context mContext;
        private final int mCornerRadius;
        private final int mImageSize;
        private final List mVariantValues;
        private final View mViews[];

        public int getCount()
        {
            return mViews.length;
        }

        public Object getItem(int i)
        {
            if (i >= 0 && i < mVariantValues.size())
            {
                return mVariantValues.get(i);
            } else
            {
                return null;
            }
        }

        public long getItemId(int i)
        {
            return 0L;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            view = null;
            if (i < mViews.length)
            {
                com.walmart.android.service.item.VariantsModel.Value value = (com.walmart.android.service.item.VariantsModel.Value)mVariantValues.get(i);
                View view1 = mViews[i];
                view = view1;
                if (view1 == null)
                {
                    if (!TextUtils.isEmpty(value.getSwatchUrl()))
                    {
                        view = ViewUtil.inflate(mContext, 0x7f04008b, viewgroup);
                        viewgroup = (ImageView)ViewUtil.findViewById(view, 0x7f1001f9);
                        Picasso.with(mContext).load(value.getSwatchUrl()).error(0x7f020340).resize(mImageSize, mImageSize).into(new DrawableTarget(viewgroup) {

                            final SwatchVariantAdapter this$0;

                            protected Drawable createDrawable(Bitmap bitmap)
                            {
                                return new CornerRadiusDrawable(bitmap, mCornerRadius);
                            }

            
            {
                this$0 = SwatchVariantAdapter.this;
                super(imageview);
            }
                        });
                    } else
                    {
                        view = ViewUtil.inflate(mContext, 0x7f04008c, viewgroup);
                        ViewUtil.setText(0x7f1001fa, view, value.getName());
                    }
                    mViews[i] = view;
                }
            }
            return view;
        }


        public SwatchVariantAdapter(Context context, Collection collection)
        {
            mContext = context;
            mVariantValues = new ArrayList(collection);
            mViews = new View[mVariantValues.size()];
            mCornerRadius = mContext.getResources().getDimensionPixelSize(0x7f0a00af);
            mImageSize = mContext.getResources().getDimensionPixelSize(0x7f0a00b0);
        }
    }

    public static interface VariantSelectionChangedListener
    {

        public abstract void onVariantSelectionChanged(com.walmart.android.service.item.VariantsModel.VariantItem variantitem);
    }

    private static class VariantsLogic
    {

        private VariantsModel mModel;
        private VariantsState mState;

        public com.walmart.android.service.item.VariantsModel.VariantItem getSelectedVariant()
        {
            if (mModel.getVariantTypeCount() == mState.getSelectionCount())
            {
                List list = getVariantItemsForCurrentSelection();
                if (list.size() == 1)
                {
                    return (com.walmart.android.service.item.VariantsModel.VariantItem)list.get(0);
                }
            }
            return null;
        }

        public Collection getValuesForTypeForCurrentSelection(com.walmart.android.service.item.VariantsModel.VariantType varianttype)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = getVariantItemsForCurrentSelection().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.walmart.android.service.item.VariantsModel.Value value = ((com.walmart.android.service.item.VariantsModel.VariantItem)iterator.next()).getValue(varianttype.getId());
                if (!arraylist.contains(value))
                {
                    arraylist.add(value);
                }
            } while (true);
            Collections.sort(arraylist);
            return arraylist;
        }

        public List getVariantItemsForCurrentSelection()
        {
            ArrayList arraylist = new ArrayList();
            Collection collection = mState.getSelectedValues();
            if (collection.isEmpty())
            {
                arraylist.addAll(mModel.getVariantItems());
            } else
            {
                Iterator iterator = mModel.getVariantItems().iterator();
                while (iterator.hasNext()) 
                {
                    com.walmart.android.service.item.VariantsModel.VariantItem variantitem = (com.walmart.android.service.item.VariantsModel.VariantItem)iterator.next();
                    if (variantitem.match(collection))
                    {
                        arraylist.add(variantitem);
                    }
                }
            }
            return arraylist;
        }

        public VariantsLogic(VariantsModel variantsmodel, VariantsState variantsstate)
        {
            mModel = variantsmodel;
            mState = variantsstate;
        }
    }

    private static class VariantsState
    {

        private HashMap mSelectedValues;

        public void deselectType(com.walmart.android.service.item.VariantsModel.VariantType varianttype)
        {
            mSelectedValues.remove(varianttype.getId());
        }

        public Collection getSelectedValues()
        {
            return Collections.unmodifiableCollection(mSelectedValues.values());
        }

        public int getSelectionCount()
        {
            return mSelectedValues.size();
        }

        public void select(com.walmart.android.service.item.VariantsModel.Value value)
        {
            mSelectedValues.put(value.getType(), value);
        }

        private VariantsState()
        {
            mSelectedValues = new HashMap();
        }

    }


    private Context mContext;
    private VariantSelectionChangedListener mListener;
    private Map mTypeToViewMap;
    private VariantsLogic mVariantsLogic;
    private VariantsModel mVariantsModel;
    private VariantsState mVariantsState;

    public VariantController(Context context)
    {
        mVariantsModel = new VariantsModel();
        mVariantsState = new VariantsState();
        mTypeToViewMap = new HashMap();
        mContext = context;
        mVariantsLogic = new VariantsLogic(mVariantsModel, mVariantsState);
    }

    private void setPreSelectedValueForVariantView(VariantView variantview, com.walmart.android.service.item.VariantsModel.Value value)
    {
        setSelectedValueForVariantView(variantview, value, false);
    }

    private void setSelectedValueForVariantView(VariantView variantview, com.walmart.android.service.item.VariantsModel.Value value, boolean flag)
    {
        if (value != null)
        {
            mVariantsState.select(value);
            com.walmart.android.service.item.VariantsModel.VariantType varianttype = null;
            com.walmart.android.service.item.VariantsModel.VariantType varianttype1 = null;
            List list = mVariantsModel.getVariantTypes();
            boolean flag1 = false;
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.walmart.android.service.item.VariantsModel.VariantType varianttype2 = (com.walmart.android.service.item.VariantsModel.VariantType)iterator.next();
                if (flag1)
                {
                    mVariantsState.deselectType(varianttype2);
                    if (varianttype1 == null)
                    {
                        varianttype1 = varianttype2;
                    }
                } else
                if (varianttype2.getId().equals(value.getVariantTypeId()))
                {
                    flag1 = true;
                    varianttype = varianttype2;
                }
            } while (true);
            variantview.setSelectedValue(value, flag);
            variantview.setTitle(mContext.getString(0x7f0901cb, new Object[] {
                varianttype.getName(), value.getName()
            }));
            if (varianttype1 != null)
            {
                setupVariantViewForTypeWithValues(varianttype1, mVariantsLogic.getValuesForTypeForCurrentSelection(varianttype1));
            }
            if (mListener != null)
            {
                mListener.onVariantSelectionChanged(mVariantsLogic.getSelectedVariant());
            }
        }
    }

    private void setUserSelectedValueForVariantView(VariantView variantview, com.walmart.android.service.item.VariantsModel.Value value)
    {
        setSelectedValueForVariantView(variantview, value, true);
    }

    private void setupVariantViewForTypeWithValues(com.walmart.android.service.item.VariantsModel.VariantType varianttype, final Collection adapter)
    {
        final VariantView variantView = (VariantView)mTypeToViewMap.get(varianttype);
        adapter = new SwatchVariantAdapter(mContext, adapter);
        variantView.setAdapter(adapter);
        variantView.setTitle(mContext.getString(0x7f0901cc, new Object[] {
            varianttype.getName()
        }));
        variantView.setValueSelectedListener(new com.walmart.android.app.item.view.VariantView.ValueClickedListener() {

            final VariantController this$0;
            final SwatchVariantAdapter val$adapter;
            final VariantView val$variantView;

            public void onValueClicked(int i)
            {
                com.walmart.android.service.item.VariantsModel.Value value = (com.walmart.android.service.item.VariantsModel.Value)adapter.getItem(i);
                setUserSelectedValueForVariantView(variantView, value);
            }

            
            {
                this$0 = VariantController.this;
                adapter = swatchvariantadapter;
                variantView = variantview;
                super();
            }
        });
        variantView.setVisibility(0);
    }

    public com.walmart.android.service.item.VariantsModel.VariantItem getSelectedVariant()
    {
        return mVariantsLogic.getSelectedVariant();
    }

    public List getVariantInfo()
    {
        ArrayList arraylist = new ArrayList();
        com.walmart.android.service.item.VariantsModel.Value value;
        for (Iterator iterator = mVariantsState.getSelectedValues().iterator(); iterator.hasNext(); arraylist.add(new Pair(value.getVariantTypeId(), value.getName())))
        {
            value = (com.walmart.android.service.item.VariantsModel.Value)iterator.next();
        }

        return arraylist;
    }

    public void populateView(ViewGroup viewgroup, String s, boolean flag)
    {
        if (mVariantsModel.getVariantTypeCount() > 0)
        {
            viewgroup.setVisibility(0);
            List list = mVariantsModel.getVariantTypes();
            com.walmart.android.service.item.VariantsModel.VariantType varianttype1;
            VariantView variantview1;
            for (Iterator iterator = list.iterator(); iterator.hasNext(); mTypeToViewMap.put(varianttype1, variantview1))
            {
                varianttype1 = (com.walmart.android.service.item.VariantsModel.VariantType)iterator.next();
                variantview1 = (VariantView)ViewUtil.inflate(mContext, 0x7f04008d, viewgroup);
                viewgroup.addView(variantview1);
            }

            viewgroup = (com.walmart.android.service.item.VariantsModel.VariantType)list.get(0);
            setupVariantViewForTypeWithValues(viewgroup, mVariantsLogic.getValuesForTypeForCurrentSelection(viewgroup));
            viewgroup = mVariantsModel.getVariantItemWithId(s);
            if (viewgroup != null)
            {
                s = list.iterator();
                do
                {
                    if (!s.hasNext())
                    {
                        break;
                    }
                    com.walmart.android.service.item.VariantsModel.VariantType varianttype = (com.walmart.android.service.item.VariantsModel.VariantType)s.next();
                    VariantView variantview = (VariantView)mTypeToViewMap.get(varianttype);
                    setPreSelectedValueForVariantView(variantview, viewgroup.getValue(varianttype));
                    if (flag)
                    {
                        variantview.hideValues();
                    }
                } while (true);
            }
        }
    }

    public void setListener(VariantSelectionChangedListener variantselectionchangedlistener)
    {
        mListener = variantselectionchangedlistener;
    }

    public void setModel(VariantsModel variantsmodel)
    {
        mVariantsModel = variantsmodel;
        mVariantsLogic = new VariantsLogic(mVariantsModel, mVariantsState);
    }

}
