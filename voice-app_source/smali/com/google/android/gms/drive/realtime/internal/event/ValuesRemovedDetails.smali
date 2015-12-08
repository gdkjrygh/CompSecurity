.class public Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mIndex:I

.field final zzCY:I

.field final zzaiA:I

.field final zzaiB:I

.field final zzaja:Ljava/lang/String;

.field final zzajb:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/realtime/internal/event/zzj;

    invoke-direct {v0}, Lcom/google/android/gms/drive/realtime/internal/event/zzj;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIIILjava/lang/String;I)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "index"    # I
    .param p3, "valueIndex"    # I
    .param p4, "valueCount"    # I
    .param p5, "movedToId"    # Ljava/lang/String;
    .param p6, "movedToIndex"    # I

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->zzCY:I

    iput p2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->mIndex:I

    iput p3, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->zzaiA:I

    iput p4, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->zzaiB:I

    iput-object p5, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->zzaja:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->zzajb:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/event/zzj;->zza(Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;Landroid/os/Parcel;I)V

    return-void
.end method
