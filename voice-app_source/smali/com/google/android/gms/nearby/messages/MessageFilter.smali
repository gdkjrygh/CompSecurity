.class public Lcom/google/android/gms/nearby/messages/MessageFilter;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/MessageFilter$1;,
        Lcom/google/android/gms/nearby/messages/MessageFilter$zza;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/MessageFilter;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzaFO:Lcom/google/android/gms/nearby/messages/MessageFilter;


# instance fields
.field final versionCode:I

.field private final zzaFP:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/MessageType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/zzb;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/MessageFilter;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/google/android/gms/nearby/messages/MessageFilter$zza;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/MessageFilter$zza;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/MessageFilter$zza;->zzwX()Lcom/google/android/gms/nearby/messages/MessageFilter$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/MessageFilter$zza;->zzwY()Lcom/google/android/gms/nearby/messages/MessageFilter;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/nearby/messages/MessageFilter;->zzaFO:Lcom/google/android/gms/nearby/messages/MessageFilter;

    return-void
.end method

.method constructor <init>(ILjava/util/List;)V
    .locals 1
    .param p1, "versionCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/MessageType;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "messageTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/nearby/messages/internal/MessageType;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/MessageFilter;->versionCode:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter;->zzaFP:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/MessageType;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "messageTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/nearby/messages/internal/MessageType;>;"
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/nearby/messages/MessageFilter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lcom/google/android/gms/nearby/messages/MessageFilter$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/List;
    .param p2, "x1"    # Lcom/google/android/gms/nearby/messages/MessageFilter$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/MessageFilter;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    .end local p1    # "o":Ljava/lang/Object;
    :goto_0
    return v0

    .restart local p1    # "o":Ljava/lang/Object;
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/nearby/messages/MessageFilter;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/nearby/messages/MessageFilter;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter;->zzaFP:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/nearby/messages/MessageFilter;->zzaFP:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzt;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/MessageFilter;->zzaFP:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzt;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MessageFilter"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/MessageFilter;->zzaFP:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/zzb;->zza(Lcom/google/android/gms/nearby/messages/MessageFilter;Landroid/os/Parcel;I)V

    return-void
.end method

.method zzwW()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/MessageType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter;->zzaFP:Ljava/util/List;

    return-object v0
.end method
