.class public abstract Lcom/urbanairship/location/ILocationService$Stub;
.super Landroid/os/Binder;
.source "ILocationService.java"

# interfaces
.implements Lcom/urbanairship/location/ILocationService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/location/ILocationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/location/ILocationService$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.urbanairship.location.ILocationService"

.field static final TRANSACTION_createLocationEvent:I = 0x2

.field static final TRANSACTION_getBestProvider:I = 0x7

.field static final TRANSACTION_getCriteria:I = 0x3

.field static final TRANSACTION_getCurrentProvider:I = 0x6

.field static final TRANSACTION_getLocation:I = 0x1

.field static final TRANSACTION_requestSingleLocationUpdate:I = 0x8

.field static final TRANSACTION_resetProviders:I = 0x5

.field static final TRANSACTION_setCriteria:I = 0x4


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.urbanairship.location.ILocationService"

    invoke-virtual {p0, p0, v0}, Lcom/urbanairship/location/ILocationService$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/urbanairship/location/ILocationService;
    .locals 2
    .param p0, "obj"    # Landroid/os/IBinder;

    .prologue
    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    .line 30
    :goto_0
    return-object v0

    .line 26
    :cond_0
    const-string v1, "com.urbanairship.location.ILocationService"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 27
    .local v0, "iin":Landroid/os/IInterface;
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/urbanairship/location/ILocationService;

    if-eqz v1, :cond_1

    .line 28
    check-cast v0, Lcom/urbanairship/location/ILocationService;

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/urbanairship/location/ILocationService$Stub$Proxy;

    .end local v0    # "iin":Landroid/os/IInterface;
    invoke-direct {v0, p0}, Lcom/urbanairship/location/ILocationService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .prologue
    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7
    .param p1, "code"    # I
    .param p2, "data"    # Landroid/os/Parcel;
    .param p3, "reply"    # Landroid/os/Parcel;
    .param p4, "flags"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v4, 0x1

    .line 38
    sparse-switch p1, :sswitch_data_0

    .line 143
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v4

    :goto_0
    return v4

    .line 42
    :sswitch_0
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :sswitch_1
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lcom/urbanairship/location/ILocationService$Stub;->getLocation()Landroid/location/Location;

    move-result-object v3

    .line 49
    .local v3, "_result":Landroid/location/Location;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 50
    if-eqz v3, :cond_0

    .line 51
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 52
    invoke-virtual {v3, p3, v4}, Landroid/location/Location;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 61
    .end local v3    # "_result":Landroid/location/Location;
    :sswitch_2
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_1

    .line 64
    sget-object v5, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    .line 70
    .local v0, "_arg0":Landroid/location/Location;
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 72
    .local v1, "_arg1":I
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 73
    .local v2, "_arg2":I
    invoke-virtual {p0, v0, v1, v2}, Lcom/urbanairship/location/ILocationService$Stub;->createLocationEvent(Landroid/location/Location;II)V

    .line 74
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 67
    .end local v0    # "_arg0":Landroid/location/Location;
    .end local v1    # "_arg1":I
    .end local v2    # "_arg2":I
    :cond_1
    const/4 v0, 0x0

    .restart local v0    # "_arg0":Landroid/location/Location;
    goto :goto_1

    .line 79
    .end local v0    # "_arg0":Landroid/location/Location;
    :sswitch_3
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 80
    invoke-virtual {p0}, Lcom/urbanairship/location/ILocationService$Stub;->getCriteria()Landroid/location/Criteria;

    move-result-object v3

    .line 81
    .local v3, "_result":Landroid/location/Criteria;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 82
    if-eqz v3, :cond_2

    .line 83
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    invoke-virtual {v3, p3, v4}, Landroid/location/Criteria;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 93
    .end local v3    # "_result":Landroid/location/Criteria;
    :sswitch_4
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_3

    .line 96
    sget-object v5, Landroid/location/Criteria;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Criteria;

    .line 101
    .local v0, "_arg0":Landroid/location/Criteria;
    :goto_2
    invoke-virtual {p0, v0}, Lcom/urbanairship/location/ILocationService$Stub;->setCriteria(Landroid/location/Criteria;)V

    .line 102
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 99
    .end local v0    # "_arg0":Landroid/location/Criteria;
    :cond_3
    const/4 v0, 0x0

    .restart local v0    # "_arg0":Landroid/location/Criteria;
    goto :goto_2

    .line 107
    .end local v0    # "_arg0":Landroid/location/Criteria;
    :sswitch_5
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p0}, Lcom/urbanairship/location/ILocationService$Stub;->resetProviders()V

    .line 109
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    .line 114
    :sswitch_6
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p0}, Lcom/urbanairship/location/ILocationService$Stub;->getCurrentProvider()Ljava/lang/String;

    move-result-object v3

    .line 116
    .local v3, "_result":Ljava/lang/String;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 117
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 122
    .end local v3    # "_result":Ljava/lang/String;
    :sswitch_7
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0}, Lcom/urbanairship/location/ILocationService$Stub;->getBestProvider()Ljava/lang/String;

    move-result-object v3

    .line 124
    .restart local v3    # "_result":Ljava/lang/String;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 125
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 130
    .end local v3    # "_result":Ljava/lang/String;
    :sswitch_8
    const-string v5, "com.urbanairship.location.ILocationService"

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 132
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_4

    .line 133
    sget-object v5, Landroid/location/Criteria;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Criteria;

    .line 138
    .restart local v0    # "_arg0":Landroid/location/Criteria;
    :goto_3
    invoke-virtual {p0, v0}, Lcom/urbanairship/location/ILocationService$Stub;->requestSingleLocationUpdate(Landroid/location/Criteria;)V

    .line 139
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    .line 136
    .end local v0    # "_arg0":Landroid/location/Criteria;
    :cond_4
    const/4 v0, 0x0

    .restart local v0    # "_arg0":Landroid/location/Criteria;
    goto :goto_3

    .line 38
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
