// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.device.DevicePhotosModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PhotoSelectionState
{

    private Set mSelection;

    public PhotoSelectionState()
    {
        mSelection = new HashSet();
    }

    public List getSelection()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(mSelection);
        Collections.sort(arraylist);
        return arraylist;
    }

    public boolean isSelected(DevicePhoto devicephoto)
    {
        return mSelection.contains(devicephoto);
    }

    public void setSelected(DevicePhoto devicephoto, boolean flag)
    {
label0:
        {
            if (devicephoto != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mSelection.add(devicephoto);
            }
            return;
        }
        mSelection.remove(devicephoto);
    }

    public int size()
    {
        return mSelection.size();
    }

    public void validate(DevicePhotosModel devicephotosmodel)
    {
        Iterator iterator = mSelection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!devicephotosmodel.exists((DevicePhoto)iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
    }
}
