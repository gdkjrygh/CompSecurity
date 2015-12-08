// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.wire;

import java.util.ArrayList;

public class WirePendingOrder
{
    public static class Order
    {

        private Customer customer;
        private ArrayList lineItems;
        private Store store;

        public Customer getCustomer()
        {
            return customer;
        }

        public ArrayList getLineItems()
        {
            return lineItems;
        }

        public Store getStore()
        {
            return store;
        }

        public void setCustomer(Customer customer1)
        {
            customer = customer1;
        }

        public void setLineItems(ArrayList arraylist)
        {
            lineItems = arraylist;
        }

        public void setStore(Store store1)
        {
            store = store1;
        }

        public Order()
        {
        }
    }

    public static class Order.Customer
    {

        private String cloudId;
        private String email;
        private String firstName;
        private String id;
        private String lastName;
        private String phone;

        public String getCloudId()
        {
            return cloudId;
        }

        public String getEmail()
        {
            return email;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getId()
        {
            return id;
        }

        public String getLastName()
        {
            return lastName;
        }

        public String getPhone()
        {
            return phone;
        }

        public void setCloudId(String s)
        {
            cloudId = s;
        }

        public void setEmail(String s)
        {
            email = s;
        }

        public void setFirstName(String s)
        {
            firstName = s;
        }

        public void setId(String s)
        {
            id = s;
        }

        public void setLastName(String s)
        {
            lastName = s;
        }

        public void setPhone(String s)
        {
            phone = s;
        }

        public Order.Customer()
        {
        }
    }

    public static class Order.OrderItem
    {

        private Crop crop;
        private String description;
        private int lineItemNumber;
        private Photo photo;
        private int projectedDpi;
        private int quantity;
        private String sku;

        public Crop getCrop()
        {
            return crop;
        }

        public String getDescription()
        {
            return description;
        }

        public int getLineItemNumber()
        {
            return lineItemNumber;
        }

        public Photo getPhoto()
        {
            return photo;
        }

        public int getProjectedDpi()
        {
            return projectedDpi;
        }

        public int getQuantity()
        {
            return quantity;
        }

        public String getSku()
        {
            return sku;
        }

        public void setCrop(Crop crop1)
        {
            crop = crop1;
        }

        public void setDescription(String s)
        {
            description = s;
        }

        public void setLineItemNumber(int i)
        {
            lineItemNumber = i;
        }

        public void setPhoto(Photo photo1)
        {
            photo = photo1;
        }

        public void setProjectedDpi(int i)
        {
            projectedDpi = i;
        }

        public void setQuantity(int i)
        {
            quantity = i;
        }

        public void setSku(String s)
        {
            sku = s;
        }

        public Order.OrderItem()
        {
        }
    }

    public static class Order.OrderItem.Crop
    {

        private double bottom;
        private double left;
        private double right;
        private double top;

        public double getBottom()
        {
            return bottom;
        }

        public double getLeft()
        {
            return left;
        }

        public double getRight()
        {
            return right;
        }

        public double getTop()
        {
            return top;
        }

        public void setBottom(double d)
        {
            bottom = d;
        }

        public void setLeft(double d)
        {
            left = d;
        }

        public void setRight(double d)
        {
            right = d;
        }

        public void setTop(double d)
        {
            top = d;
        }

        public Order.OrderItem.Crop()
        {
        }
    }

    public static class Order.OrderItem.Photo
    {

        private String filename;
        private String id;
        private String md5Sum;
        private long size;
        private String url;

        public String getFilename()
        {
            return filename;
        }

        public String getId()
        {
            return id;
        }

        public String getMd5Sum()
        {
            return md5Sum;
        }

        public long getSize()
        {
            return size;
        }

        public String getUrl()
        {
            return url;
        }

        public void setFilename(String s)
        {
            filename = s;
        }

        public void setId(String s)
        {
            id = s;
        }

        public void setMd5Sum(String s)
        {
            md5Sum = s;
        }

        public void setSize(long l)
        {
            size = l;
        }

        public void setUrl(String s)
        {
            url = s;
        }

        public Order.OrderItem.Photo()
        {
        }
    }

    public static class Order.Store
    {

        private Address address;
        private int number;
        private String phone;

        public Address getAddress()
        {
            return address;
        }

        public int getNumber()
        {
            return number;
        }

        public String getPhone()
        {
            return phone;
        }

        public void setAddress(Address address1)
        {
            address = address1;
        }

        public void setNumber(int i)
        {
            number = i;
        }

        public void setPhone(String s)
        {
            phone = s;
        }

        public Order.Store()
        {
        }
    }

    public static class Order.Store.Address
    {

        private String city;
        private String state;
        private String streetAddress;
        private int zipCode;

        public String getCity()
        {
            return city;
        }

        public String getState()
        {
            return state;
        }

        public String getStreetAddress()
        {
            return streetAddress;
        }

        public int getZipCode()
        {
            return zipCode;
        }

        public void setCity(String s)
        {
            city = s;
        }

        public void setState(String s)
        {
            state = s;
        }

        public void setStreetAddress(String s)
        {
            streetAddress = s;
        }

        public void setZipCode(int i)
        {
            zipCode = i;
        }

        public Order.Store.Address()
        {
        }
    }


    private Order order;

    public WirePendingOrder()
    {
    }

    public Order getOrder()
    {
        return order;
    }

    public void setOrder(Order order1)
    {
        order = order1;
    }
}
