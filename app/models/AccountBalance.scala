package models

object AccountBalance {
  var accountBal = 0.0
  def deposit(amount: Double): Double ={
    accountBal = accountBal + amount
    accountBal
  }

  def withdraw(amount: Double): Boolean = {
    if (amount > accountBal) return false
    accountBal = accountBal - amount
    true
  }
}
