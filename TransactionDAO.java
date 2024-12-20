package com.atm.dao;

import com.atm.model.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {
    private Connection getConnection() throws SQLException {
        // Load properties and establish connection
        // Implement