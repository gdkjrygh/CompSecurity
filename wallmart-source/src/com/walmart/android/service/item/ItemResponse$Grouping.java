// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse

public static class Group
{
    public static class Component
    {

        public int componentIndex;
        public ItemResponse.Product product;
        public int quantity;
        public boolean selected;

        public Component()
        {
        }
    }

    public static class Group
    {

        public Component components[];
        public int minRequired;
        public String title;
        public String type;

        public Group()
        {
        }
    }


    public String id;
    public Group optional[];
    public Group product;
    public Group required[];
    public Group standard[];
    public String type;

    public Group()
    {
        standard = new Group[0];
        required = new Group[0];
        optional = new Group[0];
    }
}
