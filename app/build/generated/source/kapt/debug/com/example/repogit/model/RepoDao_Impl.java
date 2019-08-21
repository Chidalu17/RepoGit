package com.example.repogit.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RepoDao_Impl implements RepoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRepo;

  public RepoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRepo = new EntityInsertionAdapter<Repo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `repo`(`id`,`name`,`desc`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Repo value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
      }
    };
  }

  @Override
  public void insertAll(final Repo... repos) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepo.insert(repos);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Repo> getAll() {
    final String _sql = "SELECT * FROM repo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final List<Repo> _result = new ArrayList<Repo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Repo _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item = new Repo(_tmpId,_tmpName,_tmpDescription);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
