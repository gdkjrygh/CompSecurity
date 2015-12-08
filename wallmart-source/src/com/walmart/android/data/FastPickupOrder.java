// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmartlabs.utils.WLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class FastPickupOrder
{
    public static class Address
    {

        public String city;
        public String state;
        public String street;
        public String zipcode;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Address)obj;
                if (city == null ? ((Address) (obj)).city != null : !city.equals(((Address) (obj)).city))
                {
                    return false;
                }
                if (state == null ? ((Address) (obj)).state != null : !state.equals(((Address) (obj)).state))
                {
                    return false;
                }
                if (street == null ? ((Address) (obj)).street != null : !street.equals(((Address) (obj)).street))
                {
                    return false;
                }
                if (zipcode == null ? ((Address) (obj)).zipcode != null : !zipcode.equals(((Address) (obj)).zipcode))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int l = 0;
            int i;
            int j;
            int k;
            if (street != null)
            {
                i = street.hashCode();
            } else
            {
                i = 0;
            }
            if (city != null)
            {
                j = city.hashCode();
            } else
            {
                j = 0;
            }
            if (state != null)
            {
                k = state.hashCode();
            } else
            {
                k = 0;
            }
            if (zipcode != null)
            {
                l = zipcode.hashCode();
            }
            return ((i * 31 + j) * 31 + k) * 31 + l;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{ street:").append(street).append(", ").append(city).append(", ").append(state).append(", ").append(zipcode).append("}").toString();
        }

        public Address()
        {
        }
    }

    public static class Data
    {

        public List orders;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Data)obj;
                if (!orders.equals(((Data) (obj)).orders))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return orders.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("[").append(FastPickupUtil.print(orders)).append("]").toString();
        }

        public Data()
        {
            orders = new ArrayList();
        }

        public Data(String s)
        {
            orders = new ArrayList();
        }
    }

    public static class Item
    {

        public static final String ORDER_ITEM_STATUS_CANCELLED = "CANCELLED";
        public static final String ORDER_ITEM_STATUS_DELAYED = "DELAYED";
        public static final String ORDER_ITEM_STATUS_DELIVERED = "DELIVERED";
        public static final String ORDER_ITEM_STATUS_EDELIVERED = "EDELIVERED";
        public static final String ORDER_ITEM_STATUS_PICKEDUP = "PICKEDUP";
        public static final String ORDER_ITEM_STATUS_PROCESSING = "PROCESSING";
        public static final String ORDER_ITEM_STATUS_READY_FOR_PICKUP = "READY_FOR_PICKUP";
        public static final String ORDER_ITEM_STATUS_RESERVED = "RESERVED";
        public static final String ORDER_ITEM_STATUS_RETURNED = "RETURNED";
        public static final String ORDER_ITEM_STATUS_SHIPPED = "SHIPPED";
        public static final String ORDER_ITEM_STATUS_UNDEFINED = "UNDEFINED";
        public static final String ORDER_ITEM_STATUS_WARRANTY_AVAILABLE_TO_PRINT = "WARRANTY_AVAILABLE_TO_PRINT";
        public String currency;
        public ItemImage displayImage;
        public String fulfillmentType;
        public String price;
        public String productId;
        public String productName;
        public int quantity;
        public String status;
        public String upc;
        public String wmItemNumber;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Item)obj;
                if (quantity != ((Item) (obj)).quantity)
                {
                    return false;
                }
                if (currency == null ? ((Item) (obj)).currency != null : !currency.equals(((Item) (obj)).currency))
                {
                    return false;
                }
                if (displayImage == null ? ((Item) (obj)).displayImage != null : !displayImage.equals(((Item) (obj)).displayImage))
                {
                    return false;
                }
                if (fulfillmentType == null ? ((Item) (obj)).fulfillmentType != null : !fulfillmentType.equals(((Item) (obj)).fulfillmentType))
                {
                    return false;
                }
                if (price == null ? ((Item) (obj)).price != null : !price.equals(((Item) (obj)).price))
                {
                    return false;
                }
                if (productId == null ? ((Item) (obj)).productId != null : !productId.equals(((Item) (obj)).productId))
                {
                    return false;
                }
                if (productName == null ? ((Item) (obj)).productName != null : !productName.equals(((Item) (obj)).productName))
                {
                    return false;
                }
                if (status == null ? ((Item) (obj)).status != null : !status.equals(((Item) (obj)).status))
                {
                    return false;
                }
                if (upc == null ? ((Item) (obj)).upc != null : !upc.equals(((Item) (obj)).upc))
                {
                    return false;
                }
                if (wmItemNumber == null ? ((Item) (obj)).wmItemNumber != null : !wmItemNumber.equals(((Item) (obj)).wmItemNumber))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int i2 = 0;
            int i;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            int j2;
            if (fulfillmentType != null)
            {
                i = fulfillmentType.hashCode();
            } else
            {
                i = 0;
            }
            if (status != null)
            {
                j = status.hashCode();
            } else
            {
                j = 0;
            }
            if (productName != null)
            {
                k = productName.hashCode();
            } else
            {
                k = 0;
            }
            if (upc != null)
            {
                l = upc.hashCode();
            } else
            {
                l = 0;
            }
            if (productId != null)
            {
                i1 = productId.hashCode();
            } else
            {
                i1 = 0;
            }
            if (wmItemNumber != null)
            {
                j1 = wmItemNumber.hashCode();
            } else
            {
                j1 = 0;
            }
            j2 = quantity;
            if (price != null)
            {
                k1 = price.hashCode();
            } else
            {
                k1 = 0;
            }
            if (currency != null)
            {
                l1 = currency.hashCode();
            } else
            {
                l1 = 0;
            }
            if (displayImage != null)
            {
                i2 = displayImage.hashCode();
            }
            return ((((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + j2) * 31 + k1) * 31 + l1) * 31 + i2;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{fulfillmentType: ").append(fulfillmentType).append(", status: ").append(status).append(" ,productName: ").append(productName).append(" ,upc: ").append(upc).append(" ,productId: ").append(productId).append(", wmItemNumber: ").append(wmItemNumber).append(", quantity: ").append(quantity).append(", price: ").append(price).append(", currency: ").append(currency).append(", displayImage: ").append(displayImage).append("}").toString();
        }

        public Item()
        {
        }
    }

    public static class ItemImage
    {

        public String normal;
        public String small;

        public String toString()
        {
            return (new StringBuilder()).append("{small: ").append(small).append(", normal:").append(normal).append("}").toString();
        }

        public ItemImage()
        {
        }
    }

    public static class Order
    {

        public int customerState;
        public String id;
        public List items;
        public String orderDate;
        public List pickupPersons;
        public Store store;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Order)obj;
                if (id == null ? ((Order) (obj)).id != null : !id.equals(((Order) (obj)).id))
                {
                    return false;
                }
                if (!items.equals(((Order) (obj)).items))
                {
                    return false;
                }
                if (orderDate == null ? ((Order) (obj)).orderDate != null : !orderDate.equals(((Order) (obj)).orderDate))
                {
                    return false;
                }
                if (!pickupPersons.equals(((Order) (obj)).pickupPersons))
                {
                    return false;
                }
                if (store == null ? ((Order) (obj)).store != null : !store.equals(((Order) (obj)).store))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int k = 0;
            int i;
            int j;
            if (id != null)
            {
                i = id.hashCode();
            } else
            {
                i = 0;
            }
            if (orderDate != null)
            {
                j = orderDate.hashCode();
            } else
            {
                j = 0;
            }
            if (store != null)
            {
                k = store.hashCode();
            }
            return (((i * 31 + j) * 31 + k) * 31 + pickupPersons.hashCode()) * 31 + items.hashCode();
        }

        public boolean isForStore(String s)
        {
            boolean flag;
            if (store != null && store.number != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag && (TextUtils.isEmpty(s) || store.number.equals(s));
        }

        public void setCustomerState(FastPickupUserStatus.Data data1)
        {
            if (data1 != null)
            {
                customerState = data1.getUserStatus();
            }
        }

        public void setItems(List list)
        {
            items = list;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{ id=").append(id).append(", orderDate:").append(orderDate).append(", store:").append(store).append(", pickupPersons:[").append(FastPickupUtil.print(pickupPersons)).append("],items [").append(FastPickupUtil.print(items)).append("]").append("}").toString();
        }

        public Order()
        {
            pickupPersons = new ArrayList();
            customerState = -1;
            items = new ArrayList();
        }
    }

    public static class PickupPerson
    {

        public String firstName;
        public String lastName;
        public String phone;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (PickupPerson)obj;
                if (firstName == null ? ((PickupPerson) (obj)).firstName != null : !firstName.equals(((PickupPerson) (obj)).firstName))
                {
                    return false;
                }
                if (lastName == null ? ((PickupPerson) (obj)).lastName != null : !lastName.equals(((PickupPerson) (obj)).lastName))
                {
                    return false;
                }
                if (phone == null ? ((PickupPerson) (obj)).phone != null : !phone.equals(((PickupPerson) (obj)).phone))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int k = 0;
            int i;
            int j;
            if (firstName != null)
            {
                i = firstName.hashCode();
            } else
            {
                i = 0;
            }
            if (lastName != null)
            {
                j = lastName.hashCode();
            } else
            {
                j = 0;
            }
            if (phone != null)
            {
                k = phone.hashCode();
            }
            return (i * 31 + j) * 31 + k;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{firstName: ").append(firstName).append(", lastName: ").append(lastName).append(", phone: ").append(phone).append("}").toString();
        }

        public PickupPerson()
        {
        }
    }

    public static class Store
    {

        public Address address;
        public String name;
        public String number;
        public String phone;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Store)obj;
                if (address == null ? ((Store) (obj)).address != null : !address.equals(((Store) (obj)).address))
                {
                    return false;
                }
                if (name == null ? ((Store) (obj)).name != null : !name.equals(((Store) (obj)).name))
                {
                    return false;
                }
                if (number == null ? ((Store) (obj)).number != null : !number.equals(((Store) (obj)).number))
                {
                    return false;
                }
                if (phone == null ? ((Store) (obj)).phone != null : !phone.equals(((Store) (obj)).phone))
                {
                    return false;
                }
            }
            return true;
        }

        public String[] getAddressLines()
        {
            return (new String[] {
                String.format(Locale.US, "%s #%s", new Object[] {
                    name, number
                }), address.street, String.format(Locale.US, "%s, %s %s", new Object[] {
                    address.city, address.state, address.zipcode
                })
            });
        }

        public int hashCode()
        {
            int l = 0;
            int i;
            int j;
            int k;
            if (name != null)
            {
                i = name.hashCode();
            } else
            {
                i = 0;
            }
            if (number != null)
            {
                j = number.hashCode();
            } else
            {
                j = 0;
            }
            if (address != null)
            {
                k = address.hashCode();
            } else
            {
                k = 0;
            }
            if (phone != null)
            {
                l = phone.hashCode();
            }
            return ((i * 31 + j) * 31 + k) * 31 + l;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{ name=").append(name).append(", number:").append(number).append(", address:").append(address).append("}").toString();
        }

        public Store()
        {
        }
    }


    private static final String TAG = com/walmart/android/data/FastPickupOrder.getSimpleName();
    private HashMap customerStatus;
    public Data data;
    public int status;

    public FastPickupOrder()
    {
        customerStatus = new HashMap();
    }

    private boolean ordersValid()
    {
        return data != null && data.orders != null && !data.orders.isEmpty();
    }

    private HashMap updateCustomerStatus()
    {
        HashMap hashmap = new HashMap();
        if (ordersValid())
        {
            Iterator iterator = data.orders.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Order order = (Order)iterator.next();
                if (order.store != null && !TextUtils.isEmpty(order.store.number))
                {
                    String s = order.store.number;
                    if (!hashmap.containsKey(s) && getCount(s) > 0)
                    {
                        hashmap.put(s, Integer.valueOf(order.customerState));
                    }
                }
            } while (true);
        }
        return hashmap;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FastPickupOrder)obj;
            if (data == null ? ((FastPickupOrder) (obj)).data != null : !data.equals(((FastPickupOrder) (obj)).data))
            {
                return false;
            }
        }
        return true;
    }

    public String getAnyFirstName(String s)
    {
label0:
        {
            WLog.d(TAG, "getStoreAddress()");
            if (!ordersValid())
            {
                break label0;
            }
            Iterator iterator = data.orders.iterator();
            PickupPerson pickupperson;
label1:
            do
            {
                if (iterator.hasNext())
                {
                    Object obj = (Order)iterator.next();
                    if (!((Order) (obj)).isForStore(s))
                    {
                        continue;
                    }
                    obj = ((Order) (obj)).pickupPersons.iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            continue label1;
                        }
                        pickupperson = (PickupPerson)((Iterator) (obj)).next();
                    } while (TextUtils.isEmpty(pickupperson.firstName));
                    break;
                }
                break label0;
            } while (true);
            return pickupperson.firstName;
        }
        return "";
    }

    public int getCount(String s)
    {
        int j;
label0:
        {
            j = 0;
            int i = 0;
            if (!ordersValid())
            {
                break label0;
            }
            Iterator iterator = data.orders.iterator();
            do
            {
                Object obj;
                do
                {
                    j = i;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (Order)iterator.next();
                } while (!((Order) (obj)).isForStore(s));
                obj = ((Order) (obj)).items.iterator();
                j = i;
                do
                {
                    i = j;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    if ("READY_FOR_PICKUP".equals(((Item)((Iterator) (obj)).next()).status))
                    {
                        j++;
                    }
                } while (true);
            } while (true);
        }
        return j;
    }

    public HashMap getCustomerStatus()
    {
        return customerStatus;
    }

    public String getHash(String s)
    {
        if (ordersValid()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L10:
        return ((String) (obj));
_L2:
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        byte abyte0[];
        byte abyte1[];
        Order order;
        Iterator iterator;
        obj3 = null;
        abyte0 = null;
        order = null;
        obj5 = null;
        obj4 = null;
        abyte1 = null;
        obj2 = null;
        iterator = null;
        obj = obj2;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        obj = obj2;
        obj2 = new ObjectOutputStream(bytearrayoutputstream);
        obj = obj4;
        obj3 = obj5;
        abyte1 = data.orders.iterator();
_L6:
        obj = obj4;
        obj3 = obj5;
        if (!abyte1.hasNext()) goto _L4; else goto _L3
_L3:
        obj = obj4;
        obj3 = obj5;
        order = (Order)abyte1.next();
        obj = obj4;
        obj3 = obj5;
        if (!order.isForStore(s)) goto _L6; else goto _L5
_L5:
        int i;
        i = 1;
        obj = obj4;
        obj3 = obj5;
        iterator = order.items.iterator();
_L9:
        obj = obj4;
        obj3 = obj5;
        if (!iterator.hasNext()) goto _L6; else goto _L7
_L7:
        obj = obj4;
        obj3 = obj5;
        Item item = (Item)iterator.next();
        obj = obj4;
        obj3 = obj5;
        if (!"READY_FOR_PICKUP".equals(item.status)) goto _L9; else goto _L8
_L8:
        boolean flag;
        flag = i;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        obj = obj4;
        obj3 = obj5;
        ((ObjectOutputStream) (obj2)).writeBytes(order.id);
        obj = obj4;
        obj3 = obj5;
        ((ObjectOutputStream) (obj2)).writeBytes(order.orderDate);
        flag = false;
        obj = obj4;
        obj3 = obj5;
        ((ObjectOutputStream) (obj2)).writeBytes(item.productId);
        obj = obj4;
        obj3 = obj5;
        ((ObjectOutputStream) (obj2)).writeInt(item.quantity);
        i = ((flag) ? 1 : 0);
          goto _L9
        obj3;
        s = ((String) (obj));
_L17:
        obj = obj2;
        ((IOException) (obj3)).printStackTrace();
        obj = s;
        if (obj2 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return s;
            }
            return s;
        }
          goto _L10
_L4:
        obj = obj4;
        obj3 = obj5;
        abyte1 = bytearrayoutputstream.toByteArray();
        s = abyte0;
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_630;
        }
        obj = obj4;
        s = abyte0;
        obj3 = obj5;
        if (abyte1.length <= 0)
        {
            break MISSING_BLOCK_LABEL_630;
        }
        obj = obj4;
        obj3 = obj5;
        abyte0 = MessageDigest.getInstance("SHA-256").digest(abyte1);
        obj = obj4;
        obj3 = obj5;
        s = new StringBuilder();
        obj = obj4;
        obj3 = obj5;
        abyte1 = new char[16];
        obj = obj4;
        obj3 = obj5;
        abyte1;
        abyte1[0] = '0';
        abyte1[1] = '1';
        abyte1[2] = '2';
        abyte1[3] = '3';
        abyte1[4] = '4';
        abyte1[5] = '5';
        abyte1[6] = '6';
        abyte1[7] = '7';
        abyte1[8] = '8';
        abyte1[9] = '9';
        abyte1[10] = 'a';
        abyte1[11] = 'b';
        abyte1[12] = 'c';
        abyte1[13] = 'd';
        abyte1[14] = 'e';
        abyte1[15] = 'f';
        i = 0;
_L12:
        obj = obj4;
        obj3 = obj5;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj4;
        obj3 = obj5;
        s.append(abyte1[abyte0[i] >> 4 & 0xf]);
        obj = obj4;
        obj3 = obj5;
        s.append(abyte1[abyte0[i] & 0xf]);
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        obj = obj4;
        obj3 = obj5;
        s = s.toString();
        obj = s;
        obj3 = s;
        WLog.d(TAG, (new StringBuilder()).append("getHash(): len=").append(abyte0.length).append(" ::").append(s).toString());
        Object obj1;
        if (obj2 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return s;
            }
            return s;
        } else
        {
            return s;
        }
        obj2;
        obj3 = order;
        s = abyte1;
_L16:
        obj = s;
        ((NoSuchAlgorithmException) (obj2)).printStackTrace();
        obj = obj3;
        if (s == null) goto _L10; else goto _L13
_L13:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((String) (obj3));
        }
        return ((String) (obj3));
        s;
_L15:
        if (obj != null)
        {
            try
            {
                ((ObjectOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        s;
        obj = obj2;
        if (true) goto _L15; else goto _L14
_L14:
        obj1;
        s = ((String) (obj2));
        obj2 = obj1;
          goto _L16
        obj1;
        obj2 = iterator;
        s = ((String) (obj3));
        obj3 = obj1;
          goto _L17
    }

    public Item getItem(String s, int i)
    {
label0:
        {
            WLog.d(TAG, (new StringBuilder()).append("getItem( ").append(s).append(", ").append(i).append(")").toString());
            if (!ordersValid())
            {
                break label0;
            }
            int j = 0;
            Iterator iterator = data.orders.iterator();
            do
            {
                Object obj;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (Order)iterator.next();
                } while (!((Order) (obj)).isForStore(s));
                obj = ((Order) (obj)).items.iterator();
                int k = j;
                do
                {
                    j = k;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Item item = (Item)((Iterator) (obj)).next();
                    if ("READY_FOR_PICKUP".equals(item.status))
                    {
                        if (i == k)
                        {
                            return item;
                        }
                        k++;
                    }
                } while (true);
            } while (true);
        }
        return null;
    }

    public Set getOrderIds(String s)
    {
        HashSet hashset = new HashSet();
        if (ordersValid())
        {
            Iterator iterator = data.orders.iterator();
label0:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Order order = (Order)iterator.next();
                if (!order.isForStore(s) || TextUtils.isEmpty(order.id) || hashset.contains(order.id))
                {
                    continue;
                }
                Iterator iterator1 = order.items.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                } while (!"READY_FOR_PICKUP".equals(((Item)iterator1.next()).status));
                hashset.add(order.id);
            } while (true);
        }
        return hashset;
    }

    public List getOrdersForStore(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = data.orders.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Order order = (Order)iterator.next();
            if (order.store.number.equals(s))
            {
                arraylist.add(order);
            }
        } while (true);
        return arraylist;
    }

    public String[] getStoreAddress(String s)
    {
label0:
        {
            WLog.d(TAG, (new StringBuilder()).append("getStoreAddress( ").append(s).append(")").toString());
            if (!ordersValid())
            {
                break label0;
            }
            Iterator iterator = data.orders.iterator();
            Order order;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                order = (Order)iterator.next();
            } while (!order.isForStore(s));
            return order.store.getAddressLines();
        }
        return new String[3];
    }

    public String getStoreName(String s)
    {
label0:
        {
            WLog.d(TAG, (new StringBuilder()).append("getStoreName( ").append(s).append(")").toString());
            if (!ordersValid())
            {
                break label0;
            }
            Iterator iterator = data.orders.iterator();
            Order order;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                order = (Order)iterator.next();
            } while (!order.isForStore(s) || order.store == null || TextUtils.isEmpty(order.store.name));
            return order.store.name;
        }
        return "";
    }

    public List getStores()
    {
        ArrayList arraylist = new ArrayList();
        if (ordersValid())
        {
            HashSet hashset = new HashSet();
            Iterator iterator = data.orders.iterator();
label0:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Order order = (Order)iterator.next();
                if (order.store == null || TextUtils.isEmpty(order.store.number) || hashset.contains(order.store.number))
                {
                    continue;
                }
                Iterator iterator1 = order.items.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                } while (!"READY_FOR_PICKUP".equals(((Item)iterator1.next()).status));
                arraylist.add(order.store);
                hashset.add(order.store.number);
            } while (true);
        }
        return arraylist;
    }

    public int hashCode()
    {
        if (data != null)
        {
            return data.hashCode();
        } else
        {
            return 0;
        }
    }

    public void setData(Data data1)
    {
        data = data1;
        customerStatus = updateCustomerStatus();
    }

    public String toString()
    {
        return (new StringBuilder()).append("{status=").append(status).append(", data:").append(data).append("}").toString();
    }

}
