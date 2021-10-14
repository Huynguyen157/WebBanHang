<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="page-breadcrumb">
	<div class="row">
		<div class="col-12 d-flex no-block align-items-center">
			<h4 class="page-title">Invoice</h4>
			<div class="ms-auto text-end">
				<nav aria-label="breadcrumb" style="margin-left:1050px;">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active" aria-current="page">Library</li>
					</ol>
				</nav>
			</div>
		</div>
	</div>
</div>
<div class="container-fluid">
	<!-- ============================================================== -->
	<!-- Start Page Content -->
	<!-- ============================================================== -->
	<div class="row">
		<div class="col-md-12">
			<div class="card card-body printableArea">
				<h3>
					<b>INVOICE</b> <span class="pull-right">#5669626</span>
				</h3>
				<hr>
				<div class="row">
					<div class="col-md-12">
						<div class="pull-left">
							<address>
								<h3>
									&nbsp;<b class="text-danger">Material Pro Admin</b>
								</h3>
								<p class="text-muted ms-1">
									E 104, Dharti-2, <br> Nr' Viswakarma Temple, <br>
									Talaja Road, <br> Bhavnagar - 364002
								</p>
							</address>
						</div>
						<div class="pull-right text-end" style="margin-left:950px;text-align:right;">
							<address>
								<h3>To,</h3>
								<h4 class="font-bold">Gaala &amp; Sons,</h4>
								<p class="text-muted ms-4">
									E 104, Dharti-2, <br> Nr' Viswakarma Temple, <br>
									Talaja Road, <br> Bhavnagar - 364002
								</p>
								<p class="mt-4">
									<b>Invoice Date :</b> <i class="fa fa-calendar"></i> 23rd Jan
									2018
								</p>
								<p>
									<b>Due Date :</b> <i class="fa fa-calendar"></i> 25th Jan 2018
								</p>
							</address>
						</div>
					</div>
					<div class="col-md-12">
						<div class="table-responsive mt-5" style="clear: both;text-align:right;">
							<table class="table table-hover">
								<thead>
									<tr>
										<th class="text-center">#</th>
										<th   style="text-align:left">Description</th>
										<th class="text-end">Quantity</th>
										<th class="text-end">Unit Cost</th>
										<th class="text-end">Total</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="text-center">1</td>
										<td  style="text-align:left">Milk Powder</td>
										<td class="text-end">2</td>
										<td class="text-end">$24</td>
										<td class="text-end">$48</td>
									</tr>
									<tr>
										<td class="text-center">2</td>
										<td  style="text-align:left">Air Conditioner</td>
										<td class="text-end">3</td>
										<td class="text-end">$500</td>
										<td class="text-end">$1500</td>
									</tr>
									<tr>
										<td class="text-center">3</td>
										<td  style="text-align:left">RC Cars</td>
										<td class="text-end">20</td>
										<td class="text-end">%600</td>
										<td class="text-end">$12000</td>
									</tr>
									<tr>
										<td class="text-center">4</td>
										<td  style="text-align:left">Down Coat</td>
										<td class="text-end">60</td>
										<td class="text-end">$5</td>
										<td class="text-end">$300</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="col-md-12" style="text-align:right;">
						<div class="pull-right mt-4 text-end">
							<p>Sub - Total amount: $13,848</p>
							<p>vat (10%) : $138</p>
							<hr>
							<h3>
								<b>Total :</b> $13,986
							</h3>
						</div>
						<div class="clearfix"></div>
						<hr>
						<div class="text-end">
							<button class="btn btn-danger text-white" type="submit">
								Proceed to payment</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- ============================================================== -->
	<!-- End PAge Content -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- Right sidebar -->
	<!-- ============================================================== -->
	<!-- .right-sidebar -->
	<!-- ============================================================== -->
	<!-- End Right sidebar -->
	<!-- ============================================================== -->
</div>