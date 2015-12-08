.class public Lcom/google/android/gms/drive/events/QueryResultEventParcelable;
.super Lcom/google/android/gms/drive/WriteAwareParcelable;

# interfaces
.implements Lcom/google/android/gms/drive/events/DriveEvent;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/drive/events/zzk;


# instance fields
.field final zzCY:I

.field final zzWu:Lcom/google/android/gms/common/data/DataHolder;

.field final zzaei:Z

.field final zzaej:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/events/zzk;

    invoke-direct {v0}, Lcom/google/android/gms/drive/events/zzk;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->CREATOR:Lcom/google/android/gms/drive/events/zzk;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/data/DataHolder;ZI)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;
    .param p3, "isStatusChanged"    # Z
    .param p4, "queryStatus"    # I

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/drive/WriteAwareParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    iput-boolean p3, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->zzaei:Z

    iput p4, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->zzaej:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public zzI(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/events/zzk;->zza(Lcom/google/android/gms/drive/events/QueryResultEventParcelable;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzpx()Lcom/google/android/gms/common/data/DataHolder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    return-object v0
.end method

.method public zzpy()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->zzaei:Z

    return v0
.end method

.method public zzpz()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->zzaej:I

    return v0
.end method
