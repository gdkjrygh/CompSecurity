.class public Lcom/google/android/gms/appdatasearch/DocumentContents$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/appdatasearch/DocumentContents;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private zzMV:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/appdatasearch/DocumentSection;",
            ">;"
        }
    .end annotation
.end field

.field private zzMW:Ljava/lang/String;

.field private zzMX:Z

.field private zzMY:Landroid/accounts/Account;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzI(Z)Lcom/google/android/gms/appdatasearch/DocumentContents$zza;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMX:Z

    return-object p0
.end method

.method public zza(Landroid/accounts/Account;)Lcom/google/android/gms/appdatasearch/DocumentContents$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMY:Landroid/accounts/Account;

    return-object p0
.end method

.method public zza(Lcom/google/android/gms/appdatasearch/DocumentSection;)Lcom/google/android/gms/appdatasearch/DocumentContents$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMV:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMV:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMV:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public zzbp(Ljava/lang/String;)Lcom/google/android/gms/appdatasearch/DocumentContents$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMW:Ljava/lang/String;

    return-object p0
.end method

.method public zzkJ()Lcom/google/android/gms/appdatasearch/DocumentContents;
    .locals 6

    new-instance v1, Lcom/google/android/gms/appdatasearch/DocumentContents;

    iget-object v2, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMW:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMX:Z

    iget-object v4, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMY:Landroid/accounts/Account;

    iget-object v0, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMV:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMV:Ljava/util/List;

    iget-object v5, p0, Lcom/google/android/gms/appdatasearch/DocumentContents$zza;->zzMV:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lcom/google/android/gms/appdatasearch/DocumentSection;

    invoke-interface {v0, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/appdatasearch/DocumentSection;

    :goto_0
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/android/gms/appdatasearch/DocumentContents;-><init>(Ljava/lang/String;ZLandroid/accounts/Account;[Lcom/google/android/gms/appdatasearch/DocumentSection;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
