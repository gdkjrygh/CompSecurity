// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class SessionState extends Enum
{
    private static final class Category extends Enum
    {

        private static final Category $VALUES[];
        public static final Category CLOSED_CATEGORY;
        public static final Category CREATED_CATEGORY;
        public static final Category OPENED_CATEGORY;

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/facebook/SessionState$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])$VALUES.clone();
        }

        static 
        {
            CREATED_CATEGORY = new Category("CREATED_CATEGORY", 0);
            OPENED_CATEGORY = new Category("OPENED_CATEGORY", 1);
            CLOSED_CATEGORY = new Category("CLOSED_CATEGORY", 2);
            $VALUES = (new Category[] {
                CREATED_CATEGORY, OPENED_CATEGORY, CLOSED_CATEGORY
            });
        }

        private Category(String s, int i)
        {
            super(s, i);
        }
    }


    private static final SessionState $VALUES[];
    public static final SessionState CLOSED;
    public static final SessionState CLOSED_LOGIN_FAILED;
    public static final SessionState CREATED;
    public static final SessionState CREATED_TOKEN_LOADED;
    public static final SessionState OPENED;
    public static final SessionState OPENED_TOKEN_UPDATED;
    public static final SessionState OPENING;
    private final Category category;

    private SessionState(String s, int i, Category category1)
    {
        super(s, i);
        category = category1;
    }

    public static SessionState valueOf(String s)
    {
        return (SessionState)Enum.valueOf(com/facebook/SessionState, s);
    }

    public static SessionState[] values()
    {
        return (SessionState[])$VALUES.clone();
    }

    public boolean isClosed()
    {
        return category == Category.CLOSED_CATEGORY;
    }

    public boolean isOpened()
    {
        return category == Category.OPENED_CATEGORY;
    }

    static 
    {
        CREATED = new SessionState("CREATED", 0, Category.CREATED_CATEGORY);
        CREATED_TOKEN_LOADED = new SessionState("CREATED_TOKEN_LOADED", 1, Category.CREATED_CATEGORY);
        OPENING = new SessionState("OPENING", 2, Category.CREATED_CATEGORY);
        OPENED = new SessionState("OPENED", 3, Category.OPENED_CATEGORY);
        OPENED_TOKEN_UPDATED = new SessionState("OPENED_TOKEN_UPDATED", 4, Category.OPENED_CATEGORY);
        CLOSED_LOGIN_FAILED = new SessionState("CLOSED_LOGIN_FAILED", 5, Category.CLOSED_CATEGORY);
        CLOSED = new SessionState("CLOSED", 6, Category.CLOSED_CATEGORY);
        $VALUES = (new SessionState[] {
            CREATED, CREATED_TOKEN_LOADED, OPENING, OPENED, OPENED_TOKEN_UPDATED, CLOSED_LOGIN_FAILED, CLOSED
        });
    }
}
