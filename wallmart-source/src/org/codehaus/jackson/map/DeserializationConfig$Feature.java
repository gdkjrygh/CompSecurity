// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            DeserializationConfig

public static final class _defaultState extends Enum
    implements _defaultState
{

    private static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT $VALUES[];
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT ACCEPT_SINGLE_VALUE_AS_ARRAY;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT AUTO_DETECT_CREATORS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT AUTO_DETECT_FIELDS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT AUTO_DETECT_SETTERS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT CAN_OVERRIDE_ACCESS_MODIFIERS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT FAIL_ON_NULL_FOR_PRIMITIVES;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT FAIL_ON_NUMBERS_FOR_ENUMS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT FAIL_ON_UNKNOWN_PROPERTIES;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT READ_ENUMS_USING_TO_STRING;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT UNWRAP_ROOT_VALUE;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT USE_ANNOTATIONS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT USE_BIG_DECIMAL_FOR_FLOATS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT USE_BIG_INTEGER_FOR_INTS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT USE_GETTERS_AS_SETTERS;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT USE_JAVA_ARRAY_FOR_JSON_ARRAY;
    public static final ACCEPT_EMPTY_STRING_AS_NULL_OBJECT WRAP_EXCEPTIONS;
    final boolean _defaultState;

    public static _defaultState valueOf(String s)
    {
        return (_defaultState)Enum.valueOf(org/codehaus/jackson/map/DeserializationConfig$Feature, s);
    }

    public static _defaultState[] values()
    {
        return (_defaultState[])$VALUES.clone();
    }

    public boolean enabledByDefault()
    {
        return _defaultState;
    }

    public int getMask()
    {
        return 1 << ordinal();
    }

    static 
    {
        USE_ANNOTATIONS = new <init>("USE_ANNOTATIONS", 0, true);
        AUTO_DETECT_SETTERS = new <init>("AUTO_DETECT_SETTERS", 1, true);
        AUTO_DETECT_CREATORS = new <init>("AUTO_DETECT_CREATORS", 2, true);
        AUTO_DETECT_FIELDS = new <init>("AUTO_DETECT_FIELDS", 3, true);
        USE_GETTERS_AS_SETTERS = new <init>("USE_GETTERS_AS_SETTERS", 4, true);
        CAN_OVERRIDE_ACCESS_MODIFIERS = new <init>("CAN_OVERRIDE_ACCESS_MODIFIERS", 5, true);
        USE_BIG_DECIMAL_FOR_FLOATS = new <init>("USE_BIG_DECIMAL_FOR_FLOATS", 6, false);
        USE_BIG_INTEGER_FOR_INTS = new <init>("USE_BIG_INTEGER_FOR_INTS", 7, false);
        USE_JAVA_ARRAY_FOR_JSON_ARRAY = new <init>("USE_JAVA_ARRAY_FOR_JSON_ARRAY", 8, false);
        READ_ENUMS_USING_TO_STRING = new <init>("READ_ENUMS_USING_TO_STRING", 9, false);
        FAIL_ON_UNKNOWN_PROPERTIES = new <init>("FAIL_ON_UNKNOWN_PROPERTIES", 10, true);
        FAIL_ON_NULL_FOR_PRIMITIVES = new <init>("FAIL_ON_NULL_FOR_PRIMITIVES", 11, false);
        FAIL_ON_NUMBERS_FOR_ENUMS = new <init>("FAIL_ON_NUMBERS_FOR_ENUMS", 12, false);
        WRAP_EXCEPTIONS = new <init>("WRAP_EXCEPTIONS", 13, true);
        ACCEPT_SINGLE_VALUE_AS_ARRAY = new <init>("ACCEPT_SINGLE_VALUE_AS_ARRAY", 14, false);
        UNWRAP_ROOT_VALUE = new <init>("UNWRAP_ROOT_VALUE", 15, false);
        ACCEPT_EMPTY_STRING_AS_NULL_OBJECT = new <init>("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 16, false);
        $VALUES = (new .VALUES[] {
            USE_ANNOTATIONS, AUTO_DETECT_SETTERS, AUTO_DETECT_CREATORS, AUTO_DETECT_FIELDS, USE_GETTERS_AS_SETTERS, CAN_OVERRIDE_ACCESS_MODIFIERS, USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, USE_JAVA_ARRAY_FOR_JSON_ARRAY, READ_ENUMS_USING_TO_STRING, 
            FAIL_ON_UNKNOWN_PROPERTIES, FAIL_ON_NULL_FOR_PRIMITIVES, FAIL_ON_NUMBERS_FOR_ENUMS, WRAP_EXCEPTIONS, ACCEPT_SINGLE_VALUE_AS_ARRAY, UNWRAP_ROOT_VALUE, ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        _defaultState = flag;
    }
}
