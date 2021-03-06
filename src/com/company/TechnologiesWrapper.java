package com.company;

public class TechnologiesWrapper<T> {
    public T frontend;
    public T backend;
    public T database;
    public T mobile;
    public T wordpress;
    public T prestashop;

    public TechnologiesWrapper(T defaultValue) {
        frontend   = defaultValue;
        backend    = defaultValue;
        database   = defaultValue;
        mobile     = defaultValue;
        wordpress  = defaultValue;
        prestashop = defaultValue;
    }

    public TechnologiesWrapper(TechnologiesWrapper<T> from) {
        frontend   = from.frontend;
        backend    = from.backend;
        database   = from.database;
        mobile     = from.mobile;
        wordpress  = from.wordpress;
        prestashop = from.prestashop;
    }

    public TechnologiesWrapper<T> setFrontend(T value) {
        frontend = value;
        return this;
    }

    public TechnologiesWrapper<T> setBackend(T value) {
        backend = value;
        return this;
    }

    public TechnologiesWrapper<T> setDatabase(T value) {
        database = value;
        return this;
    }

    public TechnologiesWrapper<T> setMobile(T value) {
        mobile = value;
        return this;
    }

    public TechnologiesWrapper<T> setWordpress(T value) {
        wordpress = value;
        return this;
    }

    public TechnologiesWrapper<T> setPrestashop(T value) {
        prestashop = value;
        return this;
    }

    public int size() {
        return 6;
    }

    public T getAtIndex(int index) {
        switch (index) {
            case 0:
                return frontend;
            case 1:
                return backend;
            case 2:
                return database;
            case 3:
                return mobile;
            case 4:
                return wordpress;
            default:
                return prestashop;
        }
    }

    public void setAtIndex(int index, T value) {
        switch (index) {
            case 0:
                frontend = value;
                break;
            case 1:
                backend = value;
                break;
            case 2:
                database = value;
                break;
            case 3:
                mobile = value;
                break;
            case 4:
                wordpress = value;
                break;
            case 5:
                prestashop = value;
                break;
        }
    }

    int addValues() {
        return (int)frontend + (int)backend + (int)database + (int)mobile + (int)wordpress + (int)prestashop;
    }

    int countNonZero() {
        return    (int)frontend==0   ? 0 : 1
                + (int)backend==0    ? 0 : 1
                + (int)database==0   ? 0 : 1
                + (int)mobile==0     ? 0 : 1
                + (int)wordpress==0  ? 0 : 1
                + (int)prestashop==0 ? 0 : 1;
    }

    @Override
    public String toString() {
        return    "Frontend:   " + frontend   + "\n"
                + "Backend:    " + backend    + "\n"
                + "Database:   " + database   + "\n"
                + "Mobile:     " + mobile     + "\n"
                + "Wordpress:  " + wordpress  + "\n"
                + "Prestashop: " + prestashop + "\n";
    }
}
