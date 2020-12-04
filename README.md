# ddcw-technical-test

## About

Technical Test backend service.

## Service Definitions

The port for this service is 1235

## Run the application locally

To run the application execute
```
sbt run
```

## GET Homepage
```
/home
```

## POST deposit
```
http://localhost:1235/backend/deposit
Input : {
	"message": "100.00"
}
```

## Put Withdraw
```
http://localhost:1235/backend/withdraw
Input : {
	"message": "100.00"
}
```

## GET Homepage
```
http://localhost:1235/backend/showbalance

```
